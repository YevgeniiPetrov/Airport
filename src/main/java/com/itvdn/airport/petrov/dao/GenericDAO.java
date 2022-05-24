package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.entity.Essence;

import java.util.List;
import java.util.Optional;

public interface GenericDAO<T extends Essence> {
    default T add(T object) {
        return new DataBase<T>().add(object);
    }

    Optional<T> get(int id);

    default T update(T object) {
        return new DataBase<T>().update(object);
    }

    default Boolean delete(T object) {
        return new DataBase<T>().delete(object);
    }

    List<T> getAll();
}
