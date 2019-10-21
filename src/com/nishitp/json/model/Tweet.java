package com.nishitp.json.model;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor
@Builder
public final class Tweet {
	
	private long userId;
	private Instant tweetTime;
	private String tweet;

}
