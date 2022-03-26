package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.FlightDAO;
import com.itvdn.airport.petrov.entity.Flight;

import java.util.List;

public class FlightDAOImpl implements FlightDAO {
    @Override
    public Flight get(int id) {
        return DataBase.get(id, Flight.class);
    }

    @Override
    public boolean delete(Flight object) {
        DataBase.delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<Flight> getAll() {
        return DataBase.getAll(Flight.class);
    }
}
