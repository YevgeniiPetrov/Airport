package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Terminal;
import com.itvdn.airport.petrov.repository.TerminalRepository;

import java.util.List;
import java.util.Optional;

public class TerminalRepositoryImpl implements TerminalRepository {
    @Override
    public Terminal add(Terminal object) {
        return new DAOFactoryImpl().getTerminalDAO().add(object);
    }

    @Override
    public Optional<Terminal> get(int id) {
        return new DAOFactoryImpl().getTerminalDAO().get(id);
    }

    @Override
    public Terminal update(Terminal object) {
        return new DAOFactoryImpl().getTerminalDAO().update(object);
    }

    @Override
    public Boolean delete(Terminal object) {
        return new DAOFactoryImpl().getTerminalDAO().delete(object);
    }

    @Override
    public List<Terminal> getAll() {
        return new DAOFactoryImpl().getTerminalDAO().getAll();
    }
}
