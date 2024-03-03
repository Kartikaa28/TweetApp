package com.tweetapp.comments;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface CommentsRepository extends CrudRepository<Comments, String> ,PagingAndSortingRepository<Comments, String> {
	
//	@Query("{'tweetId' : ?0}")
//	List<Comments> getAllBytweetId(long tweetId, Sort sort);
}
