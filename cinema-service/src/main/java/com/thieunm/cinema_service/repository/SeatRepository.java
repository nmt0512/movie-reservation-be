package com.thieunm.cinema_service.repository;

import com.thieunm.cinema_service.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Integer> {
}
