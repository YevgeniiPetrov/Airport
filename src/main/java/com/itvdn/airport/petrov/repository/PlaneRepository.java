package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Plane;

import java.util.List;
import java.util.Optional;

public interface PlaneRepository {
    Optional<Plane> getWithEmployees(int id);
    Optional<List<Plane>> getAllWithEmployees();
}
