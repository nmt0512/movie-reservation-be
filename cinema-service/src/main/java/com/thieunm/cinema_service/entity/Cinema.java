package com.thieunm.cinema_service.entity;

import com.thieunm.movie_reservation_common.entity.JpaAuditable;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "cinema")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cinema extends JpaAuditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cinema_id")
    private Integer cinemaId;

    @Column(name = "cinema_name", nullable = false)
    private String cinemaName;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "cinema")
    private List<Seat> seats;
}
