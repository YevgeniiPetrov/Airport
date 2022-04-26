package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.State;

import java.util.List;

public interface StateRepository {
    State getWithFlights(int id);
    List<State> getAllWithFlights();
}
