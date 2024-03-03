package com.tweetapp.likes;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetapp.twitter.TwitterRepository;
import com.tweetapp.twitter.twitterDatabase;
import com.tweetapp.userDetails.UserRepository;
import com.tweetapp.userDetails.Users;

@Service
public class LikesService {
	
	@Autowired
	private LikesRepository likesRepository;
	
	@Autowired
	private TwitterRepository tweetrepo;
	
	@Autowired
	private UserRepository user;
	
//	public Likes getLikesCount(long id) {
//		return likesRepository.getLikeById(id);
//	}
	
	public List<Likes> getAll() {
		return likesRepository.findAll();
	}
	
	public String updateLikes(String uname, UUID tid, Likes likes) {
		
		twitterDatabase a = tweetrepo.findbytid(tid);
		Users b = user.findByuname(uname);
		List<Likes> c = likesRepository.preventduplication(uname, tid);
		System.out.println("likkekeeeeeeekkekeee " + c);
		if(b==null)
		{
			return ("Like can not be done. Please register first");
		}
		else if(a==null)
		{
			return ("No such tweet available");
		}
		else
		{
			if(c.isEmpty()) 
			{
				likesRepository.save(likes);
				Integer like = likesRepository.getLikesCount(tid);
				return ("Number of likes " + like);
			}
			else 
			{
				Integer like = likesRepository.getLikesCount(tid);
				return ("Already liked. Number of likes " + like);
			}
		
		}
			
	}
	
	public Likes deletelike(UUID lid) {
		return likesRepository.deleteByuname(lid);
	}
	
//	public boolean check(long tweetId, String loginId) {
//		List<LikeCheck> l = likeCheckRepo.findAll();
//		
//		for(int i=0;i<l.size();i++) {
//			if(tweetId==l.get(i).getTweetId() && loginId.equals(l.get(i).getLoginId())) {
//				return true;
//			}
//				
//		}
//		return false;
//	}

}
