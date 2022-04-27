package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Terminal;
import com.itvdn.airport.petrov.repository.TerminalRepository;

import java.util.List;
import java.util.Optional;

public class TerminalRepositoryImpl implements TerminalRepository {
    @Override
    public Optional<Terminal> getWithEmployees(int id) {
        return new DAOFactoryImpl().getTerminalDAO().get(id, "employees");
    }

    @Override
    public Optional<Terminal> getWithFlights(int id) {
        return new DAOFactoryImpl().getTerminalDAO().get(id, "flights");
    }

    @Override
    public Optional<Terminal> getWithEmployeesAndFlights(int id) {
        return new DAOFactoryImpl().getTerminalDAO().get(id, "employees", "flights");
    }

    @Override
    public Optional<List<Terminal>> getAllWithEmployees() {
        return new DAOFactoryImpl().getTerminalDAO().getAll("employees");
    }

    @Override
    public Optional<List<Terminal>> getAllWithFlights() {
        return new DAOFactoryImpl().getTerminalDAO().getAll("flights");
    }

    @Override
    public Optional<List<Terminal>> getAllWithEmployeesAndFlights() {
        return new DAOFactoryImpl().getTerminalDAO().getAll("employees", "flights");
    }
}
