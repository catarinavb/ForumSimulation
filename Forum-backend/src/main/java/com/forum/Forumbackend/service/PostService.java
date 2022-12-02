package com.forum.Forumbackend.service;

import com.forum.Forumbackend.model.post.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService implements ServiceInterface<Post>{

    @Autowired
    private UserService userService;

    @Autowired
    private static ThreadService threadService;

    private List<Post> posts = new ArrayList<>();

    static{
        Post one = new DoubtPost("basics of java", "learn the basics of java", "image.jpg");
        one.setThread(threadService.findByTitle("java"));
    }


    @Override
    public Post findById(int id) {
        return null;
    }

    //TODO
    public Post create(PostType postType) {
        Post newPost;

        switch (postType){
            case DOUBT:
                newPost = new DoubtPost();
                break;
            case SUGGESTION:
                newPost = new SuggestionPost();
                break;
            case CLARIFICATION:
                newPost = new ClarificationPost();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + postType);
        }
        return newPost;
    }

    @Override
    public Post update(int id, Post post) {
        return null;
    }

    @Override
    public String delete(int id) {
        return null;
    }

    @Override
    public List<Post> getAll() {
        return posts;
    }

    public Post findByTitle(String title) {
        for(Post post : posts) {
            if(post.getTitle().equals(title)) return post;
        }
        return null;
    }
}
