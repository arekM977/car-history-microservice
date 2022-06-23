package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
    public Post addPost(Post post) {
        return postRepository.save(post);
    }

    @Transactional
    public Post editPost(Post post) {
       Post postEdited =  postRepository.findById(post.getId()).orElseThrow();
       postEdited.setTitle(post.getTitle());
       postEdited.setContent(post.getContent());

       //hibernate sam sprawdza czy zmienione są pola encji dlatego nie potrzebne wywołanie metody postRepository.save(post)  - Mechanizm dirty Checking)
       return postEdited;
    }

    public void deletePost(long id) {
        postRepository.deleteById(id);
    }
    
}
