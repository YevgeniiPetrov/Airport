package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.RouteDAO;
import com.itvdn.airport.petrov.entity.Route;

import java.util.List;

public class RouteDAOImpl implements RouteDAO {
    @Override
    public Route get(int id, String... getters) {
        return new DataBase<Route>().get(id, Route.class, getters);
    }

    @Override
    public boolean delete(Route object) {
        new DataBase<Route>().delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<Route> getAll(String... fields) {
        return new DataBase<Route>().getAll(Route.class, fields);
    }
}
