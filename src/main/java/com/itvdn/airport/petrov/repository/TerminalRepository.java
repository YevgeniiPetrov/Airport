package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Terminal;

import java.util.List;
import java.util.Optional;

public interface TerminalRepository {
    Optional<Terminal> getWithEmployees(int id);
    Optional<Terminal> getWithFlights(int id);
    Optional<Terminal> getWithEmployeesAndFlights(int id);
    Optional<List<Terminal>> getAllWithEmployees();
    Optional<List<Terminal>> getAllWithFlights();
    Optional<List<Terminal>> getAllWithEmployeesAndFlights();
}
