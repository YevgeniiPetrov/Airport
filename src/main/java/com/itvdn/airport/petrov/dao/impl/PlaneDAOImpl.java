package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.PlaneDAO;
import com.itvdn.airport.petrov.entity.Plane;

import java.util.List;
import java.util.Optional;

public class PlaneDAOImpl implements PlaneDAO {
    @Override
    public Optional<Plane> get(int id, String... fields) {
        return new DataBase<Plane>().get(id, Plane.class, fields);
    }

    @Override
    public boolean delete(Plane object) {
        new DataBase<Plane>().delete(object);
        return get(object.getId()).isEmpty();
    }

    @Override
    public Optional<List<Plane>> getAll(String... fields) {
        return new DataBase<Plane>().getAll(Plane.class, fields);
    }
}
