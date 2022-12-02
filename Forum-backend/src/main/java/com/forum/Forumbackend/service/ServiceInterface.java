package com.forum.Forumbackend.service;

import java.util.List;

public interface ServiceInterface<T> {

    T findById(int id);

    T update (int id, T t);

    String delete (int id);

    List<T> getAll();

}
