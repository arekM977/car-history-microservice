package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getPosts()
    {
        return postService.getPosts();
    }

    @GetMapping("/posts/{id}")
    public Post getSinglePost(@PathVariable long id)
    {
        return postService.getSinglePost(id);
    }

}
