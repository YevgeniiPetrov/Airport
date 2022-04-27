package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Post;
import com.itvdn.airport.petrov.repository.PostRepository;

import java.util.List;
import java.util.Optional;

public class PostRepositoryImpl implements PostRepository {
    @Override
    public Optional<Post> getWithEmployees(int id) {
        return new DAOFactoryImpl().getPostDAO().get(id, "employees");
    }

    @Override
    public Optional<List<Post>> getAllWithEmployees() {
        return new DAOFactoryImpl().getPostDAO().getAll("employees");
    }
}
