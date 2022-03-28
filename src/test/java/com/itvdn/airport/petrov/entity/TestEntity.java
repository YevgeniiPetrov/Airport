package com.itvdn.airport.petrov.entity;

import com.itvdn.airport.petrov.dao.GenericDAO;

public class TestEntity {
    public static <T> T getEntity(GenericDAO<T> genericDAO) {
        return genericDAO.getAll()
                .stream()
                .findAny()
                .get();
    }
}
