package com.example.demo.controller;


import com.example.demo.model.Comment;
import com.example.demo.model.Post;
import com.example.demo.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentController {

    @Autowired
    private CommentService commentService;


    @PostMapping("/comments/{id}")

    public Comment addComment(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }


}
