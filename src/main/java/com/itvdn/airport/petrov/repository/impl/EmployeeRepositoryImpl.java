package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.DAOFactory;
import com.itvdn.airport.petrov.entity.Employee;
import com.itvdn.airport.petrov.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private DAOFactory DAOFactory;

    @Override
    public Employee add(Employee object) {
        return DAOFactory.getEmployeeDAO().add(object);
    }

    @Override
    public Optional<Employee> get(int id) {
        return DAOFactory.getEmployeeDAO().get(id);
    }

    @Override
    public Employee update(Employee object) {
        return DAOFactory.getEmployeeDAO().update(object);
    }

    @Override
    public Boolean delete(Employee object) {
        return DAOFactory.getEmployeeDAO().delete(object);
    }

    @Override
    public List<Employee> getAll() {
        return DAOFactory.getEmployeeDAO().getAll();
    }
}
