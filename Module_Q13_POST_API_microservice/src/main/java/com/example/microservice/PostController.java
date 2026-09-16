package com.example.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

    @GetMapping("/{postId}")
    public Post getPosts(@PathVariable("postId") int postId) {

        Post post1 = new Post(
                postId,
                "its the description of post " + postId
        );

        return post1;
    }
}