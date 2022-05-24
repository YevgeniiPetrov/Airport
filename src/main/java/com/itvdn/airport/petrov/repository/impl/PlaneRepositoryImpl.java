package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Plane;
import com.itvdn.airport.petrov.repository.PlaneRepository;

import java.util.List;
import java.util.Optional;

public class PlaneRepositoryImpl implements PlaneRepository {
    @Override
    public Plane add(Plane object) {
        return new DAOFactoryImpl().getPlaneDAO().add(object);
    }

    @Override
    public Optional<Plane> get(int id) {
        return new DAOFactoryImpl().getPlaneDAO().get(id);
    }

    @Override
    public Plane update(Plane object) {
        return new DAOFactoryImpl().getPlaneDAO().update(object);
    }

    @Override
    public Boolean delete(Plane object) {
        return new DAOFactoryImpl().getPlaneDAO().delete(object);
    }

    @Override
    public List<Plane> getAll() {
        return new DAOFactoryImpl().getPlaneDAO().getAll();
    }
}
