package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.DAOFactory;
import com.itvdn.airport.petrov.entity.State;
import com.itvdn.airport.petrov.repository.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class StateRepositoryImpl implements StateRepository {
    private DAOFactory DAOFactory;

    @Override
    public State add(State object) {
        return DAOFactory.getStateDAO().add(object);
    }

    @Override
    public Optional<State> get(int id) {
        return DAOFactory.getStateDAO().get(id);
    }

    @Override
    public State update(State object) {
        return DAOFactory.getStateDAO().update(object);
    }

    @Override
    public Boolean delete(State object) {
        return DAOFactory.getStateDAO().delete(object);
    }

    @Override
    public List<State> getAll() {
        return DAOFactory.getStateDAO().getAll();
    }
}
