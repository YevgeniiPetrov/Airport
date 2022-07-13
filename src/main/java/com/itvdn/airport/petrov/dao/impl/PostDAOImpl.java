package com.itvdn.airport.petrov.dao.impl;

import com.itvdn.airport.petrov.configuration.database.DataBase;
import com.itvdn.airport.petrov.dao.PostDAO;
import com.itvdn.airport.petrov.entity.Post;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class PostDAOImpl implements PostDAO {
    private DataBase<Post> dataBase;

    @Override
    public Optional<Post> get(int id) {
        return dataBase.get(id, Post.class);
    }

    @Override
    public List<Post> getAll() {
        return dataBase.getAll(Post.class);
    }
}
