package com.baizhi.dao;

import java.util.List;

public interface BasicDao<T> {
    void insert(T t);
    void delete(String t);
    void update(T t);
    List<T> select();
    T selectOne(String t);
}
