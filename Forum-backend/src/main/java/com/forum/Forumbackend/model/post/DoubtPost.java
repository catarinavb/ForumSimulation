package com.forum.Forumbackend.model.post;

public class DoubtPost extends Post {

    public DoubtPost() {
    }

    public DoubtPost(String title, String description, String image) {
    }

    @Override
    public PostType getPostType() {
        return PostType.DOUBT;
    }

    @Override
    public void create() {

    }
}
