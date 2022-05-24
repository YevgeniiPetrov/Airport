package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.FlightDAO;
import com.itvdn.airport.petrov.entity.Flight;

import java.util.List;
import java.util.Optional;

public class FlightDAOImpl implements FlightDAO {
    @Override
    public Optional<Flight> get(int id) {
        return new DataBase<Flight>().get(id, Flight.class);
    }

    @Override
    public List<Flight> getAll() {
        return new DataBase<Flight>().getAll(Flight.class);
    }
}
