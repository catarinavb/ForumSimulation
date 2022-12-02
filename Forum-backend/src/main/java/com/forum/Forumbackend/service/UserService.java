package com.forum.Forumbackend.service;

import com.forum.Forumbackend.model.User;
import com.forum.Forumbackend.model.post.Post;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements ServiceInterface<User> {

    private static List<User> users = new ArrayList<>();
    private static List<Post> posts = new ArrayList<>();
    static{
        User girl = new User("Girl", "test123", "Ana", "Stevens", true);
        User boy = new User("Boy", "test123", "John", "Malkovich", true);
        User cat = new User("cat", "test123", "Stout","Stevens",false);
        users.add(girl);
        users.add(boy);
        users.add(cat);
    }


    @Override
    public User findById(int id) {
        return users.get(id);
    }

    public User add(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User update(int id, User user) {
        User existentUser = users.get(id);
        if (existentUser != null) {
            BeanUtils.copyProperties(user, existentUser);
            users.add(id, existentUser);
            return existentUser;
        }
        return user;
    }

    public Object findByUsername(String username) {
        for (User user: users) {
            if (user.getUserName().equals(username)) return user;
        }
        return "Username not found";
    }

    @Override
    public String delete(int id){
        User existentUser = users.get(id);
        if (existentUser != null) {
            users.remove(id);
            return "User deleted successfully";
        }
        return "User not found";
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    public List<Post> getAllPosts() {
        return posts;
    }


}
