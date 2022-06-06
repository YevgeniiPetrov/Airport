package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.entity.Flight;
import com.itvdn.airport.petrov.entity.Route;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightDAO extends GenericDAO<Flight> {
    List<Flight> getAllBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo);
    List<Flight> getAllByRoute(Route route);
}
