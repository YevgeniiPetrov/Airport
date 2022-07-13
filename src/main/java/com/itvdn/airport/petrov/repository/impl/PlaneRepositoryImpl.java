package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.DAOFactory;
import com.itvdn.airport.petrov.entity.Plane;
import com.itvdn.airport.petrov.repository.PlaneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class PlaneRepositoryImpl implements PlaneRepository {
    private DAOFactory DAOFactory;

    @Override
    public Plane add(Plane object) {
        return DAOFactory.getPlaneDAO().add(object);
    }

    @Override
    public Optional<Plane> get(int id) {
        return DAOFactory.getPlaneDAO().get(id);
    }

    @Override
    public Plane update(Plane object) {
        return DAOFactory.getPlaneDAO().update(object);
    }

    @Override
    public Boolean delete(Plane object) {
        return DAOFactory.getPlaneDAO().delete(object);
    }

    @Override
    public List<Plane> getAll() {
        return DAOFactory.getPlaneDAO().getAll();
    }
}
