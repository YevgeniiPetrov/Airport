package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Airline;

import java.util.List;

public interface AirlineRepository {
    Airline getWithFlights(int id);
    Airline getWithPlanes(int id);
    Airline getWithFlightsAndPlanes(int id);
    List<Airline> getAllWithFlights();
    List<Airline> getAllWithPlanes();
    List<Airline> getAllWithFlightsAndPlanes();
}
