package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Plane;

import java.util.List;

public interface PlaneRepository {
    Plane getWithEmployees(int id);
    List<Plane> getAllWithEmployees();
}
