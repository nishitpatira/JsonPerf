package com.nishitp.json.jmh.state;

import java.time.Instant;

import com.nishitp.json.model.Tweet;

public class JsonObjectState {
	
	public Tweet tweet = new Tweet(123456789l, Instant.now(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc tincidunt turpis leo, sit amet nullam.");
	
	public final String tweet_json = "{\"userId\":123456789,\"tweetTime\":{\"seconds\":1571503353,\"nanos\":908000000},\"tweet\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc tincidunt turpis leo, sit amet nullam.\"}";

}
