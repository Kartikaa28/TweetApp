package com.tweetapp.likes;


import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface LikesRepository extends CrudRepository<Likes, Long> {
	
//	@Query("{'id' : ?0}")
//	Likes getLikeById(long id);
//	
//	@Query(value="{'id' : ?0}", delete=true)
//	Likes deleteById(long id);

}
