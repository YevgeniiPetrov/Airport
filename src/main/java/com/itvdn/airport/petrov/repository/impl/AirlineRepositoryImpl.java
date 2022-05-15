package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Airline;
import com.itvdn.airport.petrov.repository.AirlineRepository;

import java.util.List;
import java.util.Optional;

public class AirlineRepositoryImpl implements AirlineRepository {
    @Override
    public Airline add(Airline object) {
        return new DAOFactoryImpl().getAirlineDAO().add(object);
    }

    @Override
    public Optional<Airline> get(int id) {
        return new DAOFactoryImpl().getAirlineDAO().get(id);
    }

    @Override
    public Airline update(Airline object) {
        return new DAOFactoryImpl().getAirlineDAO().update(object);
    }

    @Override
    public Boolean delete(Airline object) {
        return new DAOFactoryImpl().getAirlineDAO().delete(object);
    }

    @Override
    public List<Airline> getAll() {
        return new DAOFactoryImpl().getAirlineDAO().getAll();
    }
}
