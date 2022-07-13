package com.itvdn.airport.petrov.repository.impl;

import com.itvdn.airport.petrov.dao.DAOFactory;
import com.itvdn.airport.petrov.entity.Post;
import com.itvdn.airport.petrov.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class PostRepositoryImpl implements PostRepository {
    private DAOFactory DAOFactory;

    @Override
    public Post add(Post object) {
        return DAOFactory.getPostDAO().add(object);
    }

    @Override
    public Optional<Post> get(int id) {
        return DAOFactory.getPostDAO().get(id);
    }

    @Override
    public Post update(Post object) {
        return DAOFactory.getPostDAO().update(object);
    }

    @Override
    public Boolean delete(Post object) {
        return DAOFactory.getPostDAO().delete(object);
    }

    @Override
    public List<Post> getAll() {
        return DAOFactory.getPostDAO().getAll();
    }
}
