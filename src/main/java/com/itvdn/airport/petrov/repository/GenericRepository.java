package com.itvdn.airport.petrov.repository;

import com.itvdn.airport.petrov.entity.Essence;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GenericRepository<T extends Essence> {
    T add(T object);
    Optional<T> get(int id);
    T update(T object);
    Boolean delete(T object);
    List<T> getAll();
}
