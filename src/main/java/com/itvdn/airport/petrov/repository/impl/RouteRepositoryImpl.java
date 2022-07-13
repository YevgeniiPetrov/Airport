package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.DAOFactory;
import com.itvdn.airport.petrov.entity.Route;
import com.itvdn.airport.petrov.repository.RouteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class RouteRepositoryImpl implements RouteRepository {
    private DAOFactory DAOFactory;

    @Override
    public Route add(Route object) {
        return DAOFactory.getRouteDAO().add(object);
    }

    @Override
    public Optional<Route> get(int id) {
        return DAOFactory.getRouteDAO().get(id);
    }

    @Override
    public Route update(Route object) {
        return DAOFactory.getRouteDAO().update(object);
    }

    @Override
    public Boolean delete(Route object) {
        return DAOFactory.getRouteDAO().delete(object);
    }

    @Override
    public List<Route> getAll() {
        return DAOFactory.getRouteDAO().getAll();
    }
}
