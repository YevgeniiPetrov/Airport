package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.State;

import java.util.List;
import java.util.Optional;

public interface StateRepository {
    Optional<State> getWithFlights(int id);
    Optional<List<State>> getAllWithFlights();
}
