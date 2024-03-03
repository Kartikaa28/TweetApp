//package com.tweetapp.tweet;
//
//import java.io.Serializable;
//import java.util.Date;
//
//import org.springframework.stereotype.Component;
//
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@Component
//public class TweetAttr implements Serializable {
//	
//	private static final long serialVersionUID = 1L;
//	
//	@DynamoDBHashKey Long id;
//	
//	@DynamoDBAttribute String loginId;
//
//}
