package com.tweetapp.usersdetails;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.socialsignin.spring.data.dynamodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface UserRepository extends CrudRepository<User, String>{
	
//	User findByloginId(String loginId);
//	
//	User DeleteByloginId(String loginId);
	//@org.socialsignin.spring.data.dynamodb.repository.Query("SELECT * FROM User WHERE contains('loginId', '?0')")
//	@Query(fields = "aws dynamodb get-item \\\r\n"
//			+ "    --table-name Users \\\r\n"
//			+ "    --key 'loginId' \\\r\n"
//			+ "    --condition-expression \"contains(loginId, :?0)\" \\\r\n")
//    List<User> searchByRegex(String str);
}