package com.tweetapp.comments;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetapp.tweet.Tweet;

@Service
public class CommentsService {
	
	@Autowired
	private CommentsRepository commentsRepository;
	
	public List<Comments> getAll(long tweetId){
		Iterable<Comments> comments = commentsRepository.findAll();
		List<Comments> commentsByLoginIdList = new ArrayList<>();
		for(Comments c : comments) {
			if(c.getTweetId()==tweetId) {
				commentsByLoginIdList.add(c);
			}
		}
		return commentsByLoginIdList;
	}
	
	public Comments postComment(Comments comments) {
		return commentsRepository.save(comments);
	}
	
}