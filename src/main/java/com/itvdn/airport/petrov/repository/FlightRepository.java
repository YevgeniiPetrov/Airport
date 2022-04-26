package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Flight;

import java.util.List;

public interface FlightRepository {
    Flight getWithTickets(int id);
    Flight getWithAirlines(int id);
    Flight getWithPassengers(int id);
    Flight getWithTerminals(int id);
    Flight getWithTicketsAndPassengers(int id);
    Flight getWithAirlinesAndTerminals(int id);
    List<Flight> getAllWithTickets();
    List<Flight> getAllWithAirlines();
    List<Flight> getAllWithPassengers();
    List<Flight> getAllWithTerminals();
    List<Flight> getAllWithTicketsAndPassengers();
    List<Flight> getAllWithAirlinesAndTerminals();
}
