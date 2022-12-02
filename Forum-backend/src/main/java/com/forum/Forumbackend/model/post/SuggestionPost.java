package com.forum.Forumbackend.model.post;

public class SuggestionPost extends Post{

    public SuggestionPost() {
    }

    public SuggestionPost(String title, String description, String image) {
        super(title, description, image);
    }

    @Override
    public PostType getPostType() {
        return PostType.SUGGESTION;
    }

    @Override
    public void create() {

    }
}
