package com.forum.Forumbackend.model.post;

public class ClarificationPost extends Post {

    public ClarificationPost() {
    }

    public ClarificationPost(String title, String description, String image) {
        super(title, description, image);
    }

    @Override
    public PostType getPostType() {
        return PostType.CLARIFICATION;
    }

    @Override
    public void create() {

    }
}
