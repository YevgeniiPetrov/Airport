package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.StateDAO;
import com.itvdn.airport.petrov.entity.State;

import java.util.List;
import java.util.Optional;

public class StateDAOImpl implements StateDAO {
    @Override
    public Optional<State> get(int id) {
        return new DataBase<State>().get(id, State.class);
    }

    @Override
    public List<State> getAll() {
        return new DataBase<State>().getAll(State.class);
    }
}
