package com.tweetapp.comments;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Reply")
public class Reply {

	@Id
	private UUID rid = UUID.randomUUID();
	private UUID tid;
	private String rname;
	private String reply;
	private Date date;
	
	public Reply() {
	}

	public Reply(UUID rid, UUID tid, String rname, String reply, Date date) {
		super();
		this.rid = rid;
		this.tid = tid;
		this.rname = rname;
		this.reply = reply;
		this.date = date;
	}
	
	public UUID getRid() {
		return rid;
	}

	public void setRid(UUID rid) {
		this.rid = rid;
	}

	public UUID getTid() {
		return tid;
	}

	public void setTid(UUID tid) {
		this.tid = tid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	

	@Override
	public String toString() {
		return "Comments [rid=" + rid + ", tid=" + tid + ", rname=" + rname + ", reply=" + reply + ", date=" + date
				+ "]";
	}
	
	
	

	
}
