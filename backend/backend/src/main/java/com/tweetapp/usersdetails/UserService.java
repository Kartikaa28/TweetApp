package com.tweetapp.usersdetails;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User register(User user) {
		return userRepository.save(user);
	}
	
	public Iterable<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public Optional<User> getUser(String loginId) {
		return userRepository.findById(loginId);
	}
	
	public User updatePassword(String loginId, User user) {
		userRepository.deleteById(loginId);
		User updatedUser = userRepository.save(user);
		
		return updatedUser;
	}
	
	public List<User> searchByRegex(String str){
//		final AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
//	    final DynamoDB dynamoDB = new DynamoDB(client);
//        Table table = dynamoDB.getTable("Users");
//
//		return userRepository.searchByRegex(str);
		return null;
	}
	
	public boolean authenticate(String loginId, String password) {
		Optional<User> user = userRepository.findById(loginId);
		
		if(user==null)
			return false;
		
		if(user.orElseThrow().getPassword().equals(password)){
			return true;
		}
		else
			return false;
	}
}
