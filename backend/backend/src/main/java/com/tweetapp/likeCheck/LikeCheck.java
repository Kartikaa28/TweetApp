package com.tweetapp.likeCheck;

import org.springframework.stereotype.Component;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@DynamoDBTable(tableName = "LikeCheck")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class LikeCheck {
	
	@DynamoDBHashKey  String loginId;
	@DynamoDBAttribute Long tweetId;

}
