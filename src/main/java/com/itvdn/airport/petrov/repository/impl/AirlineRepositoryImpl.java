package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Airline;
import com.itvdn.airport.petrov.repository.AirlineRepository;

import java.util.List;

public class AirlineRepositoryImpl implements AirlineRepository {
    @Override
    public Airline getWithFlights(int id) {
        return new DAOFactoryImpl().getAirlineDAO().get(id, "flights");
    }

    @Override
    public Airline getWithPlanes(int id) {
        return new DAOFactoryImpl().getAirlineDAO().get(id, "planes");
    }

    @Override
    public Airline getWithFlightsAndPlanes(int id) {
        return new DAOFactoryImpl().getAirlineDAO().get(id, "flights", "planes");
    }

    @Override
    public List<Airline> getAllWithFlights() {
        return new DAOFactoryImpl().getAirlineDAO().getAll("flights");
    }

    @Override
    public List<Airline> getAllWithPlanes() {
        return new DAOFactoryImpl().getAirlineDAO().getAll("planes");
    }

    @Override
    public List<Airline> getAllWithFlightsAndPlanes() {
        return new DAOFactoryImpl().getAirlineDAO().getAll("flights", "planes");
    }
}
