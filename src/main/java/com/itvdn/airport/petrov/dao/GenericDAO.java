package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.configuration.database.DataBase;

import java.util.List;

public interface GenericDAO<T> {
    default T add(T object) {
        return DataBase.add(object);
    }

    T get(int id);

    default T update(T object) {
        return DataBase.update(object);
    }

    boolean delete(T object);
    List<T> getAll();
}
