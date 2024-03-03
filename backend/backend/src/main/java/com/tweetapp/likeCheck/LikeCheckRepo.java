package com.tweetapp.likeCheck;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@EnableScan
@Repository
public interface LikeCheckRepo extends CrudRepository<LikeCheck, String> {
	
//	@Query(value="{'loginId' : ?0, 'tweetId' : ?1}", delete=true)
//	LikeCheck deleteByloginId(String loginId, long tweetId);

}
