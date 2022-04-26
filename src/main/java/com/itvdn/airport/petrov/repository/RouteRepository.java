package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Route;

import java.util.List;

public interface RouteRepository {
    Route getWIthFlights(int id);
    List<Route> getAllWithFlights();
}
