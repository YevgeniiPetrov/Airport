package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Route;
import com.itvdn.airport.petrov.repository.RouteRepository;

import java.util.List;
import java.util.Optional;

public class RouteRepositoryImpl implements RouteRepository {
    @Override
    public Optional<Route> getWIthFlights(int id) {
        return new DAOFactoryImpl().getRouteDAO().get(id, "flights");
    }

    @Override
    public Optional<List<Route>> getAllWithFlights() {
        return new DAOFactoryImpl().getRouteDAO().getAll("flights");
    }
}
