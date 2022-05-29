package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.PlaneDAO;
import com.itvdn.airport.petrov.entity.Plane;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class PlaneDAOImpl implements PlaneDAO {
    private DataBase<Plane> dataBase;

    @Override
    public Optional<Plane> get(int id) {
        return dataBase.get(id, Plane.class);
    }

    @Override
    public List<Plane> getAll() {
        return dataBase.getAll(Plane.class);
    }
}
