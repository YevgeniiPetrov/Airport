package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.TerminalDAO;
import com.itvdn.airport.petrov.entity.Terminal;

import java.util.List;

public class TerminalDAOImpl implements TerminalDAO {
    @Override
    public Terminal get(int id, String... getters) {
        return new DataBase<Terminal>().get(id, Terminal.class, getters);
    }

    @Override
    public boolean delete(Terminal object) {
        new DataBase<Terminal>().delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<Terminal> getAll(String... fields) {
        return new DataBase<Terminal>().getAll(Terminal.class, fields);
    }
}
