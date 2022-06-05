package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.entity.Flight;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightDAO extends GenericDAO<Flight> {
    List<Flight> getAllBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo);
}
