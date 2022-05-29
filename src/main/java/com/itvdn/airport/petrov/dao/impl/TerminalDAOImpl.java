package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.TerminalDAO;
import com.itvdn.airport.petrov.entity.Terminal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class TerminalDAOImpl implements TerminalDAO {
    private DataBase<Terminal> dataBase;

    @Override
    public Optional<Terminal> get(int id) {
        return dataBase.get(id, Terminal.class);
    }

    @Override
    public List<Terminal> getAll() {
        return dataBase.getAll(Terminal.class);
    }
}
