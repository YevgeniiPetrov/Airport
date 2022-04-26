package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.configuration.database.DataBase;

import java.util.List;

public interface GenericDAO<T> {
    default T add(T object) {
        return new DataBase<T>().add(object);
    }

    T get(int id, String... getters);

    default T update(T object) {
        return new DataBase<T>().update(object);
    }

    boolean delete(T object);
    List<T> getAll(String... fields);
}
