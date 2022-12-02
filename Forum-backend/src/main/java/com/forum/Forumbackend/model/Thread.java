package com.forum.Forumbackend.model;

import com.forum.Forumbackend.model.post.Post;

import java.util.ArrayList;
import java.util.List;

public class Thread extends AbstractModelInterface {

    private String title;
    private List<Post> posts = new ArrayList<>();

    public Thread() {
    }

    public Thread(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post){
        posts.add(post);
        post.setThread(this);
    }

    public void deletePost(Post post){
        posts.remove(post);
        post.setThread(null);
    }

    @Override
    public void create() {
        Thread thread = new Thread();
    }
}
