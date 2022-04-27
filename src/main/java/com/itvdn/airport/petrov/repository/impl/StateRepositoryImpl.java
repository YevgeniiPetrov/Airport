package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.State;
import com.itvdn.airport.petrov.repository.StateRepository;

import java.util.List;
import java.util.Optional;

public class StateRepositoryImpl implements StateRepository {
    @Override
    public Optional<State> getWithFlights(int id) {
        return new DAOFactoryImpl().getStateDAO().get(id, "flights");
    }

    @Override
    public Optional<List<State>> getAllWithFlights() {
        return new DAOFactoryImpl().getStateDAO().getAll("flights");
    }
}
