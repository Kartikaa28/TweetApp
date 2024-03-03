package com.tweetapp.twitter;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document("twitterdata7")
public class twitterDatabase {
	
	
	
	@Id
	private UUID tid=UUID.randomUUID();
	@NonNull
	private String uname;
	@NonNull
	private String tweet;
	@NonNull
	private Date date;
	
	public twitterDatabase() {
		super();
	}


	public twitterDatabase(UUID tid, String uname, String tweet, Date date) {
		super();
		this.tid = tid;
		this.uname = uname;
		this.tweet = tweet;
		this.date = date;
	}


	public UUID getTid() {
		return tid;
	}


	public void setTid(UUID tid) {
		this.tid = tid;
	}


	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getTweet() {
		return tweet;
	}
	public void setTweet(String tweet) {
		this.tweet = tweet;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "twitterDatabase [tid=" + tid + ", uname=" + uname + ", tweet=" + tweet + ", date=" + date + "]";
	}
	
	
	
	
}
