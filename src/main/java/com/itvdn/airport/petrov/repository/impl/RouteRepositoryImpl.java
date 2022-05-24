package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Route;
import com.itvdn.airport.petrov.repository.RouteRepository;

import java.util.List;
import java.util.Optional;

public class RouteRepositoryImpl implements RouteRepository {
    @Override
    public Route add(Route object) {
        return new DAOFactoryImpl().getRouteDAO().add(object);
    }

    @Override
    public Optional<Route> get(int id) {
        return new DAOFactoryImpl().getRouteDAO().get(id);
    }

    @Override
    public Route update(Route object) {
        return new DAOFactoryImpl().getRouteDAO().update(object);
    }

    @Override
    public Boolean delete(Route object) {
        return new DAOFactoryImpl().getRouteDAO().delete(object);
    }

    @Override
    public List<Route> getAll() {
        return new DAOFactoryImpl().getRouteDAO().getAll();
    }
}
