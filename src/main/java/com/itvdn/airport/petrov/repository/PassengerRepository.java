package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Passenger;

import java.util.List;

public interface PassengerRepository extends GenericRepository<Passenger> {
    List<Passenger> getAllArrived();
}
