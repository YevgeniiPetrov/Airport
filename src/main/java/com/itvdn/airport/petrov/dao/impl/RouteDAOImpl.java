package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.RouteDAO;
import com.itvdn.airport.petrov.entity.Route;

import java.util.List;
import java.util.Optional;

public class RouteDAOImpl implements RouteDAO {
    @Override
    public Optional<Route> get(int id, String... fields) {
        return new DataBase<Route>().get(id, Route.class, fields);
    }

    @Override
    public boolean delete(Route object) {
        new DataBase<Route>().delete(object);
        return get(object.getId()).isEmpty();
    }

    @Override
    public Optional<List<Route>> getAll(String... fields) {
        return new DataBase<Route>().getAll(Route.class, fields);
    }
}
