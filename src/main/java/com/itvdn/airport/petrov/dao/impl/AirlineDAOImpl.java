package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.AirlineDAO;
import com.itvdn.airport.petrov.entity.Airline;

import java.util.List;

public class AirlineDAOImpl implements AirlineDAO {
    @Override
    public Airline get(int id) {
        return DataBase.get(id, Airline.class);
    }

    @Override
    public boolean delete(Airline object) {
        DataBase.delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<Airline> getAll() {
        return DataBase.getAll(Airline.class);
    }
}
