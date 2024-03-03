package com.tweetapp.tweet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

@Service
public class TweetService {
	
	@Autowired
	private TweetRepository tweetRepository;
	
	private static Long idCounter = 0l;
	
	public Optional<Tweet> find(Long id) {
		return tweetRepository.findById(id);
	}
	
	public Iterable<Tweet> findAll(){
		return tweetRepository.findAll();
	}
	
	public Iterable<Tweet> findByLoginId(String loginId){
		Iterable<Tweet> tweets = tweetRepository.findAll();
		List<Tweet> tweetsByLoginIdList = new ArrayList<>();
		for(Tweet t : tweets) {
			if(t.getLoginId().equals(loginId)) {
				tweetsByLoginIdList.add(t);
			}
		}
		return tweetsByLoginIdList;
	}
	
	public Tweet postTweets(Tweet t) {
		return tweetRepository.save(t);
	}
	
	public Tweet updateTweets(Tweet t) {
		if(t.getId()==-1) {
			t.setId(idCounter++);;
			return postTweets(t);
		}
		
		else {
			return tweetRepository.save(t);
		}
		
	}
	
	public void deleteTweet(Long id) {
		tweetRepository.deleteById(id);
	}
	
	public Tweet updateTweet(Long id, Tweet tweet) {
		tweetRepository.deleteById(id);
		
		Tweet updatedTweet = tweetRepository.save(tweet);
		
		return updatedTweet;
	}

}
