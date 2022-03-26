package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.TerminalDAO;
import com.itvdn.airport.petrov.entity.Employee;
import com.itvdn.airport.petrov.entity.Terminal;

import java.util.List;

public class TerminalDAOImpl implements TerminalDAO {
    @Override
    public Terminal get(int id) {
        return DataBase.get(id, Terminal.class);
    }

    @Override
    public boolean delete(Terminal object) {
        DataBase.delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<Terminal> getAll() {
        return DataBase.getAll(Terminal.class);
    }
}
