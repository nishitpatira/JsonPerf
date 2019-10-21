package com.nishitp.json.jmh.state;

import java.time.Instant;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import com.nishitp.json.model.Tweet;

import lombok.NoArgsConstructor;

@State(Scope.Benchmark)
@NoArgsConstructor
public class TweetState {

	public Tweet tweet = new Tweet(123456789l, Instant.now(),
			"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc tincidunt turpis leo, sit amet nullam.");


	public final String gson_tweet_json = "{\"userId\":123456789,\"tweetTime\":{\"seconds\":1571503353,\"nanos\":908000000},\"tweet\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc tincidunt turpis leo, sit amet nullam.\"}";

	public final String jackson_tweet_state = "{\"userId\":123456789,\"tweetTime\":1571580597.197000000,\"tweet\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc tincidunt turpis leo, sit amet nullam.\"}";
	
	public final String moshi_tweet_json = "{\"tweet\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc tincidunt turpis leo, sit amet nullam.\",\"tweetTime\":\"1571558378179\",\"userId\":123456789}";

}
