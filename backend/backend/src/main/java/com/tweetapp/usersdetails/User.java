package com.tweetapp.usersdetails;

import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.stereotype.Component;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@DynamoDBTable(tableName = "Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class User {

	@DynamoDBHashKey private String loginId;
	
	@UniqueElements
	@DynamoDBAttribute private String email;
	
    @DynamoDBAttribute private String firstName;
    @DynamoDBAttribute private String lastName;
    @DynamoDBAttribute private String password;
    @DynamoDBAttribute private String contactNumber;
}
