package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.FlightDAO;
import com.itvdn.airport.petrov.entity.Flight;

import java.util.List;

public class FlightDAOImpl implements FlightDAO {
    @Override
    public Flight get(int id, String... getters) {
        return new DataBase<Flight>().get(id, Flight.class, getters);
    }

    @Override
    public boolean delete(Flight object) {
        new DataBase<Flight>().delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<Flight> getAll(String... fields) {
        return new DataBase<Flight>().getAll(Flight.class, fields);
    }
}
