package com.example.demo.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Comment;
import com.example.demo.entity.Post;
import com.example.demo.repository.CommentRepository;

@RestController
public class ManyToOneBiController {
		
	@Autowired
	CommentRepository commentRepository;
	
	@GetMapping("/manytoone")
	public void method() {
		
		/* many to one insert
		
		Comment comment1 = new Comment();
		comment1.setCommentdesc("first comment");
		
		Comment comment2 = new Comment();
		comment2.setCommentdesc("second commit");
		
		Post post = new Post();
		post.setPostname("first post");
		
		comment1.setPost(post);
		comment2.setPost(post);
		
		HashSet<Comment> comments = new HashSet<Comment>();
		comments.add(comment1);
		comments.add(comment2);
		
		post.setComments(comments);
		
		commentRepository.save(comment1);
		commentRepository.save(comment2);
		
		*/
		
		/* many to one retrieve
		
		Comment comment = commentRepository.findOne(1);
		System.out.println(comment.getCommentid()+"\t"+comment.getCommentdesc()+"\t"+comment.getPost().getPostid()+"\t"+comment.getPost().getPostname());
		
		*/
		
		/* many to one update
		
		Comment comment = commentRepository.findOne(1);
		comment.getPost().setPostname("updated post");
		commentRepository.save(comment);
		
		*/
		
		Comment comment = commentRepository.findOne(1);
		commentRepository.delete(comment);
		
	}
}
