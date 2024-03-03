package com.tweetapp.comments;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@DynamoDBTable(tableName = "Comments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class Comments {
	
	
	@DynamoDBAttribute String comment;

	@DynamoDBHashKey long tweetId;
	@DynamoDBAttribute Date date;
	@DynamoDBAttribute String loginId;
	
}
