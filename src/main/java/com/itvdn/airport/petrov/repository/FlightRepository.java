package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Flight;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightRepository extends GenericRepository<Flight> {
    List<Flight> getAllBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo);
}
