package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.EmployeeDAO;
import com.itvdn.airport.petrov.entity.Employee;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public Employee get(int id) {
        return DataBase.get(id, Employee.class);
    }

    @Override
    public boolean delete(Employee object) {
        DataBase.delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<Employee> getAll() {
        return DataBase.getAll(Employee.class);
    }
}
