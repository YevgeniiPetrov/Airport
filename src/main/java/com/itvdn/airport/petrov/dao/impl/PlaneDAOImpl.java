package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.PlaneDAO;
import com.itvdn.airport.petrov.entity.Plane;

import java.util.List;

public class PlaneDAOImpl implements PlaneDAO {
    @Override
    public Plane get(int id, String... getters) {
        return new DataBase<Plane>().get(id, Plane.class, getters);
    }

    @Override
    public boolean delete(Plane object) {
        new DataBase<Plane>().delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<Plane> getAll(String... fields) {
        return new DataBase<Plane>().getAll(Plane.class, fields);
    }
}
