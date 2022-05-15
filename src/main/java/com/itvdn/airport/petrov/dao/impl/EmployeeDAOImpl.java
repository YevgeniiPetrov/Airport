package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.EmployeeDAO;
import com.itvdn.airport.petrov.entity.Employee;

import java.util.List;
import java.util.Optional;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public Optional<Employee> get(int id) {
        return new DataBase<Employee>().get(id, Employee.class);
    }

    @Override
    public List<Employee> getAll() {
        return new DataBase<Employee>().getAll(Employee.class);
    }
}
