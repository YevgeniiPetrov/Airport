package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.StateDAO;
import com.itvdn.airport.petrov.entity.State;

import java.util.List;
import java.util.Optional;

public class StateDAOImpl implements StateDAO {
    @Override
    public Optional<State> get(int id, String... getters) {
        return new DataBase<State>().get(id, State.class, getters);
    }

    @Override
    public boolean delete(State object) {
        new DataBase<State>().delete(object);
        return get(object.getId()).isEmpty();
    }

    @Override
    public Optional<List<State>> getAll(String... fields) {
        return new DataBase<State>().getAll(State.class, fields);
    }
}
