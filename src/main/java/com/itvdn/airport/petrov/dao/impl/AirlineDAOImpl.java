package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.AirlineDAO;
import com.itvdn.airport.petrov.entity.Airline;

import java.util.List;
import java.util.Optional;

public class AirlineDAOImpl implements AirlineDAO {
    @Override
    public Optional<Airline> get(int id) {
        return new DataBase<Airline>().get(id, Airline.class);
    }

    @Override
    public List<Airline> getAll() {
        return new DataBase<Airline>().getAll(Airline.class);
    }
}
