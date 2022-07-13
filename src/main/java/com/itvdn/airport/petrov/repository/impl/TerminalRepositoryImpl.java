package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.DAOFactory;
import com.itvdn.airport.petrov.entity.Terminal;
import com.itvdn.airport.petrov.repository.TerminalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class TerminalRepositoryImpl implements TerminalRepository {
    private DAOFactory DAOFactory;

    @Override
    public Terminal add(Terminal object) {
        return DAOFactory.getTerminalDAO().add(object);
    }

    @Override
    public Optional<Terminal> get(int id) {
        return DAOFactory.getTerminalDAO().get(id);
    }

    @Override
    public Terminal update(Terminal object) {
        return DAOFactory.getTerminalDAO().update(object);
    }

    @Override
    public Boolean delete(Terminal object) {
        return DAOFactory.getTerminalDAO().delete(object);
    }

    @Override
    public List<Terminal> getAll() {
        return DAOFactory.getTerminalDAO().getAll();
    }
}
