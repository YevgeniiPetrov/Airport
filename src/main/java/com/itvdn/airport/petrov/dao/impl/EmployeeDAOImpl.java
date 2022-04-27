package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.EmployeeDAO;
import com.itvdn.airport.petrov.entity.Employee;

import java.util.List;
import java.util.Optional;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public Optional<Employee> get(int id, String... getters) {
        return new DataBase<Employee>().get(id, Employee.class, getters);
    }

    @Override
    public boolean delete(Employee object) {
        new DataBase<Employee>().delete(object);
        return get(object.getId()).isEmpty();
    }

    @Override
    public Optional<List<Employee>> getAll(String... fields) {
        return new DataBase<Employee>().getAll(Employee.class, fields);
    }
}
