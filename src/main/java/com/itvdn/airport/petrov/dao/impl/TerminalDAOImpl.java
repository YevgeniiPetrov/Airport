package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.TerminalDAO;
import com.itvdn.airport.petrov.entity.Terminal;

import java.util.List;
import java.util.Optional;

public class TerminalDAOImpl implements TerminalDAO {
    @Override
    public Optional<Terminal> get(int id, String... fields) {
        return new DataBase<Terminal>().get(id, Terminal.class, fields);
    }

    @Override
    public boolean delete(Terminal object) {
        new DataBase<Terminal>().delete(object);
        return get(object.getId()).isEmpty();
    }

    @Override
    public Optional<List<Terminal>> getAll(String... fields) {
        return new DataBase<Terminal>().getAll(Terminal.class, fields);
    }
}
