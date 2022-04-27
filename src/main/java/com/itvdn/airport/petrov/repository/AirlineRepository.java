package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Airline;

import java.util.List;
import java.util.Optional;

public interface AirlineRepository {
    Optional<Airline> getWithFlights(int id);
    Optional<Airline> getWithPlanes(int id);
    Optional<Airline> getWithFlightsAndPlanes(int id);
    Optional<List<Airline>> getAllWithFlights();
    Optional<List<Airline>> getAllWithPlanes();
    Optional<List<Airline>> getAllWithFlightsAndPlanes();
}
