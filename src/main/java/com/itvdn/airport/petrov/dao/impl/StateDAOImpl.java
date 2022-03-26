package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.StateDAO;
import com.itvdn.airport.petrov.entity.State;

import java.util.List;

public class StateDAOImpl implements StateDAO {
    @Override
    public State get(int id) {
        return DataBase.get(id, State.class);
    }

    @Override
    public boolean delete(State object) {
        DataBase.delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<State> getAll() {
        return DataBase.getAll(State.class);
    }
}
