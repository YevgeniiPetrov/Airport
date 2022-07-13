package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.RouteDAO;
import com.itvdn.airport.petrov.entity.Route;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class RouteDAOImpl implements RouteDAO {
    private DataBase<Route> dataBase;

    @Override
    public Optional<Route> get(int id) {
        return dataBase.get(id, Route.class);
    }

    @Override
    public List<Route> getAll() {
        return dataBase.getAll(Route.class);
    }
}
