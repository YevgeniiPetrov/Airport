package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Flight;
import com.itvdn.airport.petrov.repository.FlightRepository;

import java.util.List;

public class FlightRepositoryImpl implements FlightRepository {
    @Override
    public Flight getWithTickets(int id) {
        return new DAOFactoryImpl().getFlightDAO().get(id, "tickets");
    }

    @Override
    public Flight getWithAirlines(int id) {
        return new DAOFactoryImpl().getFlightDAO().get(id, "airlines");
    }

    @Override
    public Flight getWithPassengers(int id) {
        return new DAOFactoryImpl().getFlightDAO().get(id, "passengers");
    }

    @Override
    public Flight getWithTerminals(int id) {
        return new DAOFactoryImpl().getFlightDAO().get(id, "terminals");
    }

    @Override
    public Flight getWithTicketsAndPassengers(int id) {
        return new DAOFactoryImpl().getFlightDAO().get(id, "tickets", "passengers");
    }

    @Override
    public Flight getWithAirlinesAndTerminals(int id) {
        return new DAOFactoryImpl().getFlightDAO().get(id, "airlines", "terminals");
    }

    @Override
    public List<Flight> getAllWithTickets() {
        return new DAOFactoryImpl().getFlightDAO().getAll("tickets");
    }

    @Override
    public List<Flight> getAllWithAirlines() {
        return new DAOFactoryImpl().getFlightDAO().getAll("airlines");
    }

    @Override
    public List<Flight> getAllWithPassengers() {
        return new DAOFactoryImpl().getFlightDAO().getAll("passengers");
    }

    @Override
    public List<Flight> getAllWithTerminals() {
        return new DAOFactoryImpl().getFlightDAO().getAll("terminals");
    }

    @Override
    public List<Flight> getAllWithTicketsAndPassengers() {
        return new DAOFactoryImpl().getFlightDAO().getAll("tickets", "passengers");
    }

    @Override
    public List<Flight> getAllWithAirlinesAndTerminals() {
        return new DAOFactoryImpl().getFlightDAO().getAll("airlines", "terminals");
    }
}
