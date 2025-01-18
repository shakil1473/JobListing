package com.shakil.joblisting.controller;

import com.shakil.joblisting.model.Post;
import com.shakil.joblisting.services.PostServices;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostServices m_PostServices;

    public PostController(PostServices postServices) {
        this.m_PostServices = postServices;
    }

    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("https://web.postman.co/");
    }
    @RequestMapping("/job/getall")
    @GetMapping
    public List<Post> getPost() {
        return m_PostServices.findAll();
    }

    @RequestMapping("/job/search/{text}")
    public List<Post> searchPost(@PathVariable String text) {
        return m_PostServices.findAll();
    }

    @PostMapping("/job/post")
    public Post addPost(@RequestBody Post post) {
        return m_PostServices.save(post);
    }
}
