package com.forum.Forumbackend.model.post;

import com.forum.Forumbackend.model.AbstractModelInterface;
import com.forum.Forumbackend.model.Thread;
import com.forum.Forumbackend.model.User;

//Generic post model to be used as a base for concrete types of posts
public abstract class Post extends AbstractModelInterface {

    private Thread thread;
    private User user;
    private String title;
    private String description;
    private String image;

    public Post() {
    }

    public Post(String title, String description, String image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public abstract PostType getPostType();

}
