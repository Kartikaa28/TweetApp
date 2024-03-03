package com.tweetapp.config;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.github.javafaker.Faker;
import com.tweetapp.comments.CommentsRepository;
import com.tweetapp.likeCheck.LikeCheckRepo;
import com.tweetapp.likes.LikesRepository;
import com.tweetapp.tweet.TweetRepository;
import com.tweetapp.usersdetails.UserRepository;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
import java.util.Locale;
 
@Configuration
@EnableDynamoDBRepositories(basePackageClasses = {UserRepository.class,LikesRepository.class,CommentsRepository.class,TweetRepository.class,LikeCheckRepo.class})
public class BeanConfig {
 
    @Value("${amazon.dynamodb.endpoint}")
    String endpoint;
    @Value("${amazon.aws.accesskey}")
    String accesskey;
    @Value("${amazon.aws.secretkey}")
    String secretkey;
    @Value("${amazon.aws.region}")
    String region;
 
    public AwsClientBuilder.EndpointConfiguration endpointConfiguration() {
        return new AwsClientBuilder.EndpointConfiguration(endpoint, region);
    }
 
    public AWSCredentialsProvider awsCredentialsProvider() {
        return new AWSStaticCredentialsProvider(new BasicAWSCredentials(accesskey, secretkey));
    }
 
    @Bean
    public AmazonDynamoDB amazonDynamoDB() {
        return AmazonDynamoDBClientBuilder
                .standard()
                .withEndpointConfiguration(endpointConfiguration())
                .withCredentials(awsCredentialsProvider())
                .build();
    }
 
}