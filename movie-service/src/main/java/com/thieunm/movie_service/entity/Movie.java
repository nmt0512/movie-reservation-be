package com.thieunm.movie_service.entity;

import com.thieunm.movie_reservation_common.entity.JpaAuditable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "movie")
public class Movie extends JpaAuditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Integer movieId;

    @Column(name = "movie_name", nullable = false)
    private String movieName;

    @Column(name = "description")
    private String description;

    @Column(name = "run_time")
    private Integer runTime;

    @Column(name = "release_date", nullable = false)
    private LocalDate releaseDate;
}