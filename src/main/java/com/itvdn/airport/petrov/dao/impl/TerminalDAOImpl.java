package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.TerminalDAO;
import com.itvdn.airport.petrov.entity.Terminal;

import java.util.List;
import java.util.Optional;

public class TerminalDAOImpl implements TerminalDAO {
    @Override
    public Optional<Terminal> get(int id) {
        return new DataBase<Terminal>().get(id, Terminal.class);
    }

    @Override
    public List<Terminal> getAll() {
        return new DataBase<Terminal>().getAll(Terminal.class);
    }
}
