package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    Optional<Employee> getWithTerminals(int id);
    Optional<Employee> getWithPlanes(int id);
    Optional<Employee> getWithTerminalsAndPlanes(int id);
    Optional<List<Employee>> getAllWithTerminals();
    Optional<List<Employee>> getAllWithPlanes();
    Optional<List<Employee>> getWithTerminalsAndPlanes();
}
