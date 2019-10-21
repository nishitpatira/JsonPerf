package com.nishitp.json.jmh.state;

import java.time.Instant;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;

public class InstantAdapterMoshi {
	
	@ToJson
	String toJson(Instant instant) {
		return ((Long)instant.toEpochMilli()).toString();
	}
	
	@FromJson
	Instant fromJson(String instant){
		return Instant.ofEpochMilli(Long.parseLong(instant));
	}

}
