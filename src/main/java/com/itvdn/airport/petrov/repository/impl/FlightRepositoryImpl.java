package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Flight;
import com.itvdn.airport.petrov.repository.FlightRepository;

import java.util.List;
import java.util.Optional;

public class FlightRepositoryImpl implements FlightRepository {
    @Override
    public Flight add(Flight object) {
        return new DAOFactoryImpl().getFlightDAO().add(object);
    }

    @Override
    public Optional<Flight> get(int id) {
        return new DAOFactoryImpl().getFlightDAO().get(id);
    }

    @Override
    public Flight update(Flight object) {
        return new DAOFactoryImpl().getFlightDAO().update(object);
    }

    @Override
    public Boolean delete(Flight object) {
        return new DAOFactoryImpl().getFlightDAO().delete(object);
    }

    @Override
    public List<Flight> getAll() {
        return new DAOFactoryImpl().getFlightDAO().getAll();
    }
}
