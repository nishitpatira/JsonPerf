package com.nishitp.json.jmh.state;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import com.nishitp.json.model.ShipmentOrder;
import com.nishitp.json.model.Tweet;
import com.nishitp.json.model.UserHistory;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import lombok.NoArgsConstructor;

@State(Scope.Benchmark)
@NoArgsConstructor
public class MoshiState {

	public static final Moshi moshi = new Moshi.Builder().add(new InstantAdapterMoshi()).build();
	
	public static final JsonAdapter<Tweet> tweetAdapter = moshi.adapter(Tweet.class);
	public static final JsonAdapter<ShipmentOrder> shipmentAdapter = moshi.adapter(ShipmentOrder.class);
	public static final JsonAdapter<UserHistory> userHistoryAdapter = moshi.adapter(UserHistory.class);
}
