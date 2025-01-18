package com.shakil.joblisting.repository;

import com.shakil.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
