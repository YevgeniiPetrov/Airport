package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.PostDAO;
import com.itvdn.airport.petrov.entity.Post;

import java.util.List;

public class PostDAOImpl implements PostDAO {
    @Override
    public Post get(int id, String... getters) {
        return new DataBase<Post>().get(id, Post.class, getters);
    }

    @Override
    public boolean delete(Post object) {
        new DataBase<Post>().delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<Post> getAll(String... fields) {
        return new DataBase<Post>().getAll(Post.class, fields);
    }
}
