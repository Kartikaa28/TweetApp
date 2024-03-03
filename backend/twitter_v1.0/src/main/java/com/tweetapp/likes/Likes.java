package com.tweetapp.likes;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Likes")
public class Likes {
	
	@Id
	private UUID lid = UUID.randomUUID();
	private UUID tid;
	private String lname;
		
	public Likes() {
	}
	
	public Likes(UUID lid, UUID tid, String lname) {
		super();
		this.lid = lid;
		this.tid = tid;
		this.lname = lname;
	}

	public UUID getLid() {
		return lid;
	}

	public void setLid(UUID lid) {
		this.lid = lid;
	}

	public UUID getTid() {
		return tid;
	}

	public void setTid(UUID tid) {
		this.tid = tid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Likes [lid=" + lid + ", tid=" + tid + ", lname=" + lname + "]";
	}

	
	

}
