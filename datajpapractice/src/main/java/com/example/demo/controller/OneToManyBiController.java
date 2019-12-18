package com.example.demo.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Comment;
import com.example.demo.entity.Post;
import com.example.demo.repository.PostRepository;

@RestController
public class OneToManyBiController {
	
	@Autowired
	PostRepository postRepository;
	
	@GetMapping(value="/onetomany")
	public void method() {
		
		/* one to many insert
		  
		Comment comment1 = new Comment();
		comment1.setCommentid(1);
		comment1.setCommentdesc("first comment");
		
		Comment comment2 = new Comment();
		comment2.setCommentid(2);
		comment2.setCommentdesc("second commit");

		HashSet comments = new HashSet();
		comments.add(comment1);
		comments.add(comment2);
		
		Post post = new Post();
		post.setPostid(1);
		post.setPostname("first post");
		post.setComments(comments);
		
		comment1.setPost(post);
		comment2.setPost(post);
		
		postRepository.save(post);
		
		*/
		
		/* one to many retrieve
		  
		Post post = postRepository.findOne(1);
		System.out.println(post.getPostid()+"\t"+post.getPostname());
		for(Comment comment : post.getComments()) {
			System.out.println(comment.getCommentid()+"\t"+comment.getCommentdesc());
		}
		*/
		
		/* one to many update
		
		Post post = postRepository.findOne(1);
		post.setPostname("modified post");
		for(Comment comment : post.getComments()) {
			comment.setCommentdesc("modified comment");
		}
		
		postRepository.save(post);
		
		*/
		
		/* one to many delete
		  
		postRepository.delete(postRepository.findOne(1));
		
		*/
		
	}
}
