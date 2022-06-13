package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getPosts()
    {
        return postRepository.findAll();
    }

    public Post getSinglePost(long id)
    {
        return postRepository.findById(id)
                .orElseThrow();
    }
}
