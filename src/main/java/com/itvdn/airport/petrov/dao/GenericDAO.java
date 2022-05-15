package com.itvdn.airport.petrov.dao;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.entity.Essence;

import java.util.List;
import java.util.Optional;

public interface GenericDAO<T> {
    default <T extends Essence> T add(T object) {
        return new DataBase<T>().add(object);
    }

    Optional<T> get(int id);

    default <T extends Essence> T update(T object) {
        return new DataBase<T>().update(object);
    }

    default <T extends Essence> Boolean delete(T object) {
        return new DataBase<T>().delete(object);
    }

    <T extends Essence> List<T> getAll();
}
