package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.AirlineDAO;
import com.itvdn.airport.petrov.entity.Airline;

import java.util.List;
import java.util.Optional;

public class AirlineDAOImpl implements AirlineDAO {
    @Override
    public Optional<Airline> get(int id, String... getters) {
        return new DataBase<Airline>().get(id, Airline.class, getters);
    }

    @Override
    public boolean delete(Airline object) {
        new DataBase<Airline>().delete(object);
        return get(object.getId()).isEmpty();
    }

    @Override
    public Optional<List<Airline>> getAll(String... fields) {
        return new DataBase<Airline>().getAll(Airline.class, fields);
    }
}
