package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Passenger;

import java.util.List;
import java.util.Optional;

public interface PassengerRepository {
    Optional<Passenger> getWithTickets(int id);
    Optional<Passenger> getWithFlights(int id);
    Optional<Passenger> getWithTicketsAndFlights(int id);
    Optional<List<Passenger>> getAllWithTickets();
    Optional<List<Passenger>> getAllWithFlights();
    Optional<List<Passenger>> getAllWithTicketsAndFlights();
}
