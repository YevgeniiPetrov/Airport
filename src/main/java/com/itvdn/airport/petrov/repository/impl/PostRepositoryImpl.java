package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import com.itvdn.airport.petrov.entity.Post;
import com.itvdn.airport.petrov.repository.PostRepository;

import java.util.List;
import java.util.Optional;

public class PostRepositoryImpl implements PostRepository {
    @Override
    public Post add(Post object) {
        return new DAOFactoryImpl().getPostDAO().add(object);
    }

    @Override
    public Optional<Post> get(int id) {
        return new DAOFactoryImpl().getPostDAO().get(id);
    }

    @Override
    public Post update(Post object) {
        return new DAOFactoryImpl().getPostDAO().update(object);
    }

    @Override
    public Boolean delete(Post object) {
        return new DAOFactoryImpl().getPostDAO().delete(object);
    }

    @Override
    public List<Post> getAll() {
        return new DAOFactoryImpl().getPostDAO().getAll();
    }
}
