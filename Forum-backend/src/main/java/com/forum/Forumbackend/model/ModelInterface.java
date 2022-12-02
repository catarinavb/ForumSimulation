package com.forum.Forumbackend.model;

// Common interface for a model class, provide methods to get and set ids
public interface ModelInterface<T> {

    void create();

    Integer getId();

    void setId(Integer id);
}
