package com.forum.Forumbackend.model;

import org.springframework.stereotype.Component;

public class User extends AbstractModelInterface {

    private String userName;
    private String password;
    private String FirstName;
    private String LastName;
    private Boolean registered;

    public User(){}

    public User(String userName, String password, String firstName, String lastName, Boolean registered) {
        this.userName = userName;
        this.password = password;
        FirstName = firstName;
        LastName = lastName;
        this.registered = registered;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Boolean getRegistered() {
        return registered;
    }

    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }


    @Override
    public void create() {
        User user = new User();
    }
}
