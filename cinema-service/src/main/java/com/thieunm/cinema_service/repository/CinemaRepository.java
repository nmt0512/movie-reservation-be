package com.thieunm.cinema_service.repository;

import com.thieunm.cinema_service.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema, Integer> {
}
