package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.PostDAO;
import com.itvdn.airport.petrov.entity.Post;

import java.util.List;
import java.util.Optional;

public class PostDAOImpl implements PostDAO {
    @Override
    public Optional<Post> get(int id) {
        return new DataBase<Post>().get(id, Post.class);
    }

    @Override
    public List<Post> getAll() {
        return new DataBase<Post>().getAll(Post.class);
    }
}
