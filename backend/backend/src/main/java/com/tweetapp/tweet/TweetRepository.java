package com.tweetapp.tweet;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface TweetRepository extends CrudRepository<Tweet, Long> ,PagingAndSortingRepository<Tweet, Long>{
	
//	@Query("{'loginId' : ?0}")
//	List<Tweet> findByloginId(String loginId, Sort sort);
//	
//	@Query(value="{'id' : ?0}", delete=true)
//	Tweet DeleteById(String id);
//	
//	@Query("{'id' : ?0}")
//	Tweet getById(long id);

}
