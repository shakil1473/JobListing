package com.shakil.joblisting.services;

import com.shakil.joblisting.model.Post;
import com.shakil.joblisting.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class PostServices {
    @Autowired
    private PostRepository m_PostRepository;

    public PostServices(PostRepository postRepository) {
        this.m_PostRepository = postRepository;
    }

    public Post save(Post post) {
        return m_PostRepository.save(post);
    }

    public List<Post> findAll() {
        return m_PostRepository.findAll();
    }
}
