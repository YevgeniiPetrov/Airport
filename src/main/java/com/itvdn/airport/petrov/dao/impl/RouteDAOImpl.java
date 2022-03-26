package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.RouteDAO;
import com.itvdn.airport.petrov.entity.Route;

import java.util.List;

public class RouteDAOImpl implements RouteDAO {
    @Override
    public Route get(int id) {
        return DataBase.get(id, Route.class);
    }

    @Override
    public boolean delete(Route object) {
        DataBase.delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<Route> getAll() {
        return DataBase.getAll(Route.class);
    }
}
