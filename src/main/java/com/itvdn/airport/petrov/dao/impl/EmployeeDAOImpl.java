package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.EmployeeDAO;
import com.itvdn.airport.petrov.entity.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class EmployeeDAOImpl implements EmployeeDAO {
    private DataBase<Employee> dataBase;

    @Override
    public Optional<Employee> get(int id) {
        return dataBase.get(id, Employee.class);
    }

    @Override
    public List<Employee> getAll() {
        return dataBase.getAll(Employee.class);
    }
}
