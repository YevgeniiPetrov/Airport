package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Terminal;
import com.itvdn.airport.petrov.repository.TerminalRepository;

import java.util.List;

public class TerminalRepositoryImpl implements TerminalRepository {
    @Override
    public Terminal getWithEmployees(int id) {
        return new DAOFactoryImpl().getTerminalDAO().get(id, "employees");
    }

    @Override
    public Terminal getWithFlights(int id) {
        return new DAOFactoryImpl().getTerminalDAO().get(id, "flights");
    }

    @Override
    public Terminal getWithEmployeesAndFlights(int id) {
        return new DAOFactoryImpl().getTerminalDAO().get(id, "employees", "flights");
    }

    @Override
    public List<Terminal> getAllWithEmployees() {
        return new DAOFactoryImpl().getTerminalDAO().getAll("employees");
    }

    @Override
    public List<Terminal> getAllWithFlights() {
        return new DAOFactoryImpl().getTerminalDAO().getAll("flights");
    }

    @Override
    public List<Terminal> getAllWithEmployeesAndFlights() {
        return new DAOFactoryImpl().getTerminalDAO().getAll("employees", "flights");
    }
}
