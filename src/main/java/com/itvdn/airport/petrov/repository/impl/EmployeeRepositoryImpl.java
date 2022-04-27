package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Employee;
import com.itvdn.airport.petrov.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Override
    public Optional<Employee> getWithTerminals(int id) {
        return new DAOFactoryImpl().getEmployeeDAO().get(id, "terminals");
    }

    @Override
    public Optional<Employee> getWithPlanes(int id) {
        return new DAOFactoryImpl().getEmployeeDAO().get(id, "planes");
    }

    @Override
    public Optional<Employee> getWithTerminalsAndPlanes(int id) {
        return new DAOFactoryImpl().getEmployeeDAO().get(id, "terminals", "planes");
    }

    @Override
    public Optional<List<Employee>> getAllWithTerminals() {
        return new DAOFactoryImpl().getEmployeeDAO().getAll("terminals");
    }

    @Override
    public Optional<List<Employee>> getAllWithPlanes() {
        return new DAOFactoryImpl().getEmployeeDAO().getAll("planes");
    }

    @Override
    public Optional<List<Employee>> getWithTerminalsAndPlanes() {
        return new DAOFactoryImpl().getEmployeeDAO().getAll("terminals", "planes");
    }
}
