package com.codegym.service;

import com.codegym.dao.IUserDAO;
import com.codegym.model.User;

import java.util.List;

public class UserService implements IUserService{
    private IUserDAO userDAO;

    public UserService(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void create(User user) {

    }

    @Override
    public void updateById(int id, User user) {

    }

    @Override
    public void deleteById(int id) {

    }
}
