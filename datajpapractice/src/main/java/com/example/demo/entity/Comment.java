package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class Comment{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="commentid")
	private int commentid;
	@Column(name="commentdesc")
	private String commentdesc;
	@ManyToOne(optional=false,cascade=CascadeType.ALL)
	@JoinColumn(name="postid",nullable=false)
	private Post post;
	
	public int getCommentid() {
		return commentid;
	}
	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}
	public String getCommentdesc() {
		return commentdesc;
	}
	public void setCommentdesc(String commentdesc) {
		this.commentdesc = commentdesc;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
}
