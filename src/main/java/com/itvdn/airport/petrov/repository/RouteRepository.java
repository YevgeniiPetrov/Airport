package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Route;

import java.util.List;
import java.util.Optional;

public interface RouteRepository {
    Optional<Route> getWIthFlights(int id);
    Optional<List<Route>> getAllWithFlights();
}
