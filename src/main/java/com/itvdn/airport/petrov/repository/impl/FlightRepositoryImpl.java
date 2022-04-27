package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Flight;
import com.itvdn.airport.petrov.repository.FlightRepository;

import java.util.List;
import java.util.Optional;

public class FlightRepositoryImpl implements FlightRepository {
    @Override
    public Optional<Flight> getWithTickets(int id) {
        return new DAOFactoryImpl().getFlightDAO().get(id, "tickets");
    }

    @Override
    public Optional<Flight> getWithAirlines(int id) {
        return new DAOFactoryImpl().getFlightDAO().get(id, "airlines");
    }

    @Override
    public Optional<Flight> getWithPassengers(int id) {
        return new DAOFactoryImpl().getFlightDAO().get(id, "passengers");
    }

    @Override
    public Optional<Flight> getWithTerminals(int id) {
        return new DAOFactoryImpl().getFlightDAO().get(id, "terminals");
    }

    @Override
    public Optional<Flight> getWithTicketsAndPassengers(int id) {
        return new DAOFactoryImpl().getFlightDAO().get(id, "tickets", "passengers");
    }

    @Override
    public Optional<Flight> getWithAirlinesAndTerminals(int id) {
        return new DAOFactoryImpl().getFlightDAO().get(id, "airlines", "terminals");
    }

    @Override
    public Optional<List<Flight>> getAllWithTickets() {
        return new DAOFactoryImpl().getFlightDAO().getAll("tickets");
    }

    @Override
    public Optional<List<Flight>> getAllWithAirlines() {
        return new DAOFactoryImpl().getFlightDAO().getAll("airlines");
    }

    @Override
    public Optional<List<Flight>> getAllWithPassengers() {
        return new DAOFactoryImpl().getFlightDAO().getAll("passengers");
    }

    @Override
    public Optional<List<Flight>> getAllWithTerminals() {
        return new DAOFactoryImpl().getFlightDAO().getAll("terminals");
    }

    @Override
    public Optional<List<Flight>> getAllWithTicketsAndPassengers() {
        return new DAOFactoryImpl().getFlightDAO().getAll("tickets", "passengers");
    }

    @Override
    public Optional<List<Flight>> getAllWithAirlinesAndTerminals() {
        return new DAOFactoryImpl().getFlightDAO().getAll("airlines", "terminals");
    }
}
