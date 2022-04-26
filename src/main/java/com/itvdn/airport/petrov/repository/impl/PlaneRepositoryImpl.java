package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Plane;
import com.itvdn.airport.petrov.repository.PlaneRepository;

import java.util.List;

public class PlaneRepositoryImpl implements PlaneRepository {
    @Override
    public Plane getWithEmployees(int id) {
        return new DAOFactoryImpl().getPlaneDAO().get(id, "employees");
    }

    @Override
    public List<Plane> getAllWithEmployees() {
        return new DAOFactoryImpl().getPlaneDAO().getAll("employees");
    }
}
