package com.codegym.dao;

import java.util.List;

public interface IGeneralDAO<T> {
    List<T> findAll();

    T findById(int id);

    void create(T t);

    void updateById(int id, T t);

    void deleteById(int id);
}
