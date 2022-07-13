package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.StateDAO;
import com.itvdn.airport.petrov.entity.State;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class StateDAOImpl implements StateDAO {
    private DataBase<State> dataBase;

    @Override
    public Optional<State> get(int id) {
        return dataBase.get(id, State.class);
    }

    @Override
    public List<State> getAll() {
        return dataBase.getAll(State.class);
    }
}
