package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.PostDAO;
import com.itvdn.airport.petrov.entity.Post;

import java.util.List;

public class PostDAOImpl implements PostDAO {
    @Override
    public Post get(int id) {
        return DataBase.get(id, Post.class);
    }

    @Override
    public boolean delete(Post object) {
        DataBase.delete(object);
        return get(object.getId()) == null;
    }

    @Override
    public List<Post> getAll() {
        return DataBase.getAll(Post.class);
    }
}
