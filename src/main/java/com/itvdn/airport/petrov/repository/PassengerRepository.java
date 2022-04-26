package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Passenger;

import java.util.List;

public interface PassengerRepository {
    Passenger getWithTickets(int id);
    Passenger getWithFlights(int id);
    Passenger getWithTicketsAndFlights(int id);
    List<Passenger> getAllWithTickets();
    List<Passenger> getAllWithFlights();
    List<Passenger> getAllWithTicketsAndFlights();
}
