package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.PostDAO;
import com.itvdn.airport.petrov.entity.Post;

import java.util.List;
import java.util.Optional;

public class PostDAOImpl implements PostDAO {
    @Override
    public Optional<Post> get(int id, String... fields) {
        return new DataBase<Post>().get(id, Post.class, fields);
    }

    @Override
    public boolean delete(Post object) {
        new DataBase<Post>().delete(object);
        return get(object.getId()).isEmpty();
    }

    @Override
    public Optional<List<Post>> getAll(String... fields) {
        return new DataBase<Post>().getAll(Post.class, fields);
    }
}
