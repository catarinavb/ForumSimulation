package com.forum.Forumbackend.model.post;

import java.util.Arrays;
import java.util.List;

//Possible types of posts
public enum PostType {

    DOUBT,
    SUGGESTION,
    CLARIFICATION;

    //list of post types
    public static List<PostType> list() {
        return Arrays.asList(PostType.values());
    }
}
