package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.PlaneDAO;
import com.itvdn.airport.petrov.entity.Plane;

import java.util.List;

public class PlaneDAOImpl implements PlaneDAO {
    @Override
    public Plane get(int id) {
        return DataBase.get(id, Plane.class);
    }

    @Override
    public boolean delete(Plane object) {
        DataBase.delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<Plane> getAll() {
        return DataBase.getAll(Plane.class);
    }
}
