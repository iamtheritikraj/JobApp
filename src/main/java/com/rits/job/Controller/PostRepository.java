package com.rits.job.Controller;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rits.job.Models.Post;

public interface PostRepository extends MongoRepository<Post,String>
{
	
}