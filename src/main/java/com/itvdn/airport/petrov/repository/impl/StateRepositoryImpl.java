package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.State;
import com.itvdn.airport.petrov.repository.StateRepository;

import java.util.List;
import java.util.Optional;

public class StateRepositoryImpl implements StateRepository {
    @Override
    public State add(State object) {
        return new DAOFactoryImpl().getStateDAO().add(object);
    }

    @Override
    public Optional<State> get(int id) {
        return new DAOFactoryImpl().getStateDAO().get(id);
    }

    @Override
    public State update(State object) {
        return new DAOFactoryImpl().getStateDAO().update(object);
    }

    @Override
    public Boolean delete(State object) {
        return new DAOFactoryImpl().getStateDAO().delete(object);
    }

    @Override
    public List<State> getAll() {
        return new DAOFactoryImpl().getStateDAO().getAll();
    }
}
