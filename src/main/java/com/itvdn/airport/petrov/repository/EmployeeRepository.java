package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Employee;

import java.util.List;

public interface EmployeeRepository {
    Employee getWithTerminals(int id);
    Employee getWithPlanes(int id);
    Employee getWithTerminalsAndPlanes(int id);
    List<Employee> getAllWithTerminals();
    List<Employee> getAllWithPlanes();
    List<Employee> getWithTerminalsAndPlanes();
}
