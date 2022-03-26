package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.PassengerDAO;
import com.itvdn.airport.petrov.entity.Passenger;

import java.util.List;

public class PassengerDAOImpl implements PassengerDAO {
    @Override
    public Passenger get(int id) {
        return DataBase.get(id, Passenger.class);
    }

    @Override
    public boolean delete(Passenger object) {
        DataBase.delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<Passenger> getAll() {
        return DataBase.getAll(Passenger.class);
    }
}
