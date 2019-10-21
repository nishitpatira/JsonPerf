package com.nishitp.json.model;

import java.time.Instant;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Builder
@ToString
public final class UserHistory {

	private final long id;
	private final List<Tweet> tweets;
	private final List<Tweet> likes;
	private final Instant registerationTime;
	private final long mobile;
	private final String email;
	private final boolean priority;

}
