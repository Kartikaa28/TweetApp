package com.tweetapp.likes;


import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface LikesRepository extends MongoRepository<Likes, String> {
	
	@Query(value ="{tid: ?0}", count=true)           
	Integer getLikesCount(UUID tid);

	@Query(value ="{lid: ?0}", delete=true)           
	Likes deleteByuname(UUID lid);
	
	@Query(value ="{lname: ?0, tid: ?1}}")
    List<Likes> preventduplication(String lname, UUID tid);
}
