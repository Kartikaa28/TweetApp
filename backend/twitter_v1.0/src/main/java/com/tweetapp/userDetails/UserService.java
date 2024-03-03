package com.tweetapp.userDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Users register(Users user) {
		return userRepository.save(user);
	}
	
	public List<Users> getAllUsers(){
		return userRepository.findAll();
	}
	
	public Users getUser(String loginId) {
		return userRepository.findByuname(loginId);
	}
	
	public String updatePassword(String uname,Users user) {
		Users user1 = userRepository.findByuname(uname);
		
		if(user1==null)
		{
			return "No such user available";
		}
		else
		{
			userRepository.DeleteByuname(uname);
			@SuppressWarnings("unused")
			Users updatedUser = userRepository.save(user);
			return "Password Updated";
		}
	}
	
	public List<Users> searchByRegex(String str){
		return userRepository.searchByRegex(str);
	}
	
	public String authenticate(String uname, String password) {
		Users user = userRepository.findByuname(uname);
		
		if(user==null)
			return "No such user available";
		
		if(user.getPassword().equals(password)){
			return "Successfully Logged In";
		}
		else
			return "Authentication Failed";
	}

}
