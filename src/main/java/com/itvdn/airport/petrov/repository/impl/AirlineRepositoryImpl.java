package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Airline;
import com.itvdn.airport.petrov.repository.AirlineRepository;

import java.util.List;
import java.util.Optional;

public class AirlineRepositoryImpl implements AirlineRepository {
    @Override
    public Optional<Airline> getWithFlights(int id) {
        return new DAOFactoryImpl().getAirlineDAO().get(id, "flights");
    }

    @Override
    public Optional<Airline> getWithPlanes(int id) {
        return new DAOFactoryImpl().getAirlineDAO().get(id, "planes");
    }

    @Override
    public Optional<Airline> getWithFlightsAndPlanes(int id) {
        return new DAOFactoryImpl().getAirlineDAO().get(id, "flights", "planes");
    }

    @Override
    public Optional<List<Airline>> getAllWithFlights() {
        return new DAOFactoryImpl().getAirlineDAO().getAll("flights");
    }

    @Override
    public Optional<List<Airline>> getAllWithPlanes() {
        return new DAOFactoryImpl().getAirlineDAO().getAll("planes");
    }

    @Override
    public Optional<List<Airline>> getAllWithFlightsAndPlanes() {
        return new DAOFactoryImpl().getAirlineDAO().getAll("flights", "planes");
    }
}
