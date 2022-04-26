package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.AirlineDAO;
import com.itvdn.airport.petrov.entity.Airline;

import java.util.List;

public class AirlineDAOImpl implements AirlineDAO {
    @Override
    public Airline get(int id, String... getters) {
        return new DataBase<Airline>().get(id, Airline.class, getters);
    }

    @Override
    public boolean delete(Airline object) {
        new DataBase<Airline>().delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<Airline> getAll(String... fields) {
        return new DataBase<Airline>().getAll(Airline.class, fields);
    }
}
