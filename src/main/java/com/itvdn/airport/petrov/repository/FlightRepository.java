package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Flight;

import java.util.List;
import java.util.Optional;

public interface FlightRepository {
    Optional<Flight> getWithTickets(int id);
    Optional<Flight> getWithAirlines(int id);
    Optional<Flight> getWithPassengers(int id);
    Optional<Flight> getWithTerminals(int id);
    Optional<Flight> getWithTicketsAndPassengers(int id);
    Optional<Flight> getWithAirlinesAndTerminals(int id);
    Optional<List<Flight>> getAllWithTickets();
    Optional<List<Flight>> getAllWithAirlines();
    Optional<List<Flight>> getAllWithPassengers();
    Optional<List<Flight>> getAllWithTerminals();
    Optional<List<Flight>> getAllWithTicketsAndPassengers();
    Optional<List<Flight>> getAllWithAirlinesAndTerminals();
}
