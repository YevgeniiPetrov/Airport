package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.configuration.database.DataBase;

import java.util.List;
import java.util.Optional;

public interface GenericDAO<T> {
    default T add(T object) {
        return new DataBase<T>().add(object);
    }

    Optional<T> get(int id, String... fields);

    default T update(T object) {
        return new DataBase<T>().update(object);
    }

    boolean delete(T object);
    Optional<List<T>> getAll(String... fields);
}
