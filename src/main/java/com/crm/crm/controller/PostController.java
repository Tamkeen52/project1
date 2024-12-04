package com.crm.crm.controller;


import com.crm.crm.entity.Post;
import com.crm.crm.repository.CommentRepository;
import com.crm.crm.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app/v1/post")
public class PostController {

    private PostRepository postRepository;
    private CommentRepository commentRepository;

    public PostController(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }


    @PostMapping
    public String addPost(@RequestBody Post post){
        postRepository.save(post);
        return null;
    }

    @DeleteMapping
    public void deletePost(){
        postRepository.deleteById(1L);
    }
}
