package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Terminal;

import java.util.List;

public interface TerminalRepository {
    Terminal getWithEmployees(int id);
    Terminal getWithFlights(int id);
    Terminal getWithEmployeesAndFlights(int id);
    List<Terminal> getAllWithEmployees();
    List<Terminal> getAllWithFlights();
    List<Terminal> getAllWithEmployeesAndFlights();
}
