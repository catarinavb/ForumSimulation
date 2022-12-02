package com.forum.Forumbackend.controller;

import com.forum.Forumbackend.model.post.Post;
import com.forum.Forumbackend.model.post.PostType;
import com.forum.Forumbackend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/forum")
public class PostController {

    @Autowired
    private PostService postService;

    //TODO check it does not contain any words banned
    @PostMapping("/adddoubt")
    public ResponseEntity<Object> addDoubtPost (@RequestBody Post post){
        return ResponseEntity.status(HttpStatus.OK).body(postService.create(PostType.DOUBT));
    }
}
