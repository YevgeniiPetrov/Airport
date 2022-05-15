package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Employee;
import com.itvdn.airport.petrov.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Override
    public Employee add(Employee object) {
        return new DAOFactoryImpl().getEmployeeDAO().add(object);
    }

    @Override
    public Optional<Employee> get(int id) {
        return new DAOFactoryImpl().getEmployeeDAO().get(id);
    }

    @Override
    public Employee update(Employee object) {
        return new DAOFactoryImpl().getEmployeeDAO().update(object);
    }

    @Override
    public Boolean delete(Employee object) {
        return new DAOFactoryImpl().getEmployeeDAO().delete(object);
    }

    @Override
    public List<Employee> getAll() {
        return new DAOFactoryImpl().getEmployeeDAO().getAll();
    }
}
