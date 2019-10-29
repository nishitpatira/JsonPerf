package com.nishitp.json.frameworks;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import com.nishitp.json.jmh.state.GsonState;
import com.nishitp.json.jmh.state.JacksonState;
import com.nishitp.json.jmh.state.MoshiState;
import com.nishitp.json.jmh.state.ShipmentOrderState;
import com.nishitp.json.jmh.state.TweetState;
import com.nishitp.json.jmh.state.UserState;
import com.nishitp.json.model.ShipmentOrder;
import com.nishitp.json.model.Tweet;
import com.nishitp.json.model.UserHistory;

//http://tutorials.jenkov.com/java-performance/jmh.html
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 2, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10)
@Fork(warmups = 1, value = 3)
public class GsonTest {

	/*@Benchmark
	public void Gson_Tweet_ToJson(GsonState gsonState, TweetState state, Blackhole blackhole) {
		String jsonString = gsonState.GSON.toJson(state.tweet);
		blackhole.consume(jsonString);
	}

	@Benchmark
	public void Gson_Tweet_ToObject(GsonState gsonState, TweetState state, Blackhole blackhole) {
		Tweet tweet = gsonState.GSON.fromJson(state.gson_tweet_json, Tweet.class);
		blackhole.consume(tweet);
	}

	@Benchmark
	public void jackson_Tweet_toJson(JacksonState jacksonState, TweetState state, Blackhole blackhole)
			throws Exception {
		String str = jacksonState.objectMapper.writeValueAsString(state.tweet);
		blackhole.consume(str);
	}

	@Benchmark
	public void jackson_Tweet_toObject(JacksonState jacksonState, TweetState state, Blackhole blackhole)
			throws Exception {
		Tweet tweet = jacksonState.objectMapper.readValue(state.jackson_tweet_state, Tweet.class);
		blackhole.consume(tweet);
	}

	@Benchmark
	public void moshi_Tweet_toJson(TweetState state, Blackhole blackhole) throws Exception {
		String str = MoshiState.tweetAdapter.toJson(state.tweet);
		blackhole.consume(str);
	}

	@Benchmark
	public void moshi_Tweet_toObject(TweetState state, Blackhole blackhole) throws Exception {
		Tweet tweet = MoshiState.tweetAdapter.fromJson(state.moshi_tweet_json);
		blackhole.consume(tweet);
	}

	@Benchmark
	public void Gson_ShipmentOrder_ToJson(GsonState gsonState, ShipmentOrderState state, Blackhole blackhole) {
		String jsonString = gsonState.GSON.toJson(state.order);
		blackhole.consume(jsonString);
	}

	@Benchmark
	public void Gson_ShipmentOrder_ToObject(GsonState gsonState, ShipmentOrderState state, Blackhole blackhole) {
		ShipmentOrder shipmentOrder = gsonState.GSON.fromJson(state.gson_shipment_json, ShipmentOrder.class);
		blackhole.consume(shipmentOrder);
	}

	@Benchmark
	public void jackson_ShipmentOrder_toJson(JacksonState jacksonState, ShipmentOrderState state, Blackhole blackhole)
			throws Exception {
		String str = jacksonState.objectMapper.writeValueAsString(state.order);
		blackhole.consume(str);
	}

	@Benchmark
	public void jackson_ShipmentOrder_toObject(JacksonState jacksonState, ShipmentOrderState state, Blackhole blackhole)
			throws Exception {
		ShipmentOrder order = jacksonState.objectMapper.readValue(state.jackson_shipment_json, ShipmentOrder.class);
		blackhole.consume(order);
	}

	@Benchmark
	public void moshi_ShipmentOrder_toJson(ShipmentOrderState state, Blackhole blackhole) throws Exception {
		String str = MoshiState.shipmentAdapter.toJson(state.order);
		blackhole.consume(str);
	}

	@Benchmark
	public void moshi_ShipmentOrder_toObject(ShipmentOrderState state, Blackhole blackhole) throws Exception {
		ShipmentOrder order = MoshiState.shipmentAdapter.fromJson(state.moshi_shipment_json);
		blackhole.consume(order);
	}

	@Benchmark
	public void Gson_UserHistory_ToJson(GsonState gsonState, UserState state, Blackhole blackhole) {
		String jsonString = gsonState.GSON.toJson(state.userHistory);
		blackhole.consume(jsonString);
	}

	@Benchmark
	public void Gson_UserHistory_ToObject(GsonState gsonState, UserState state, Blackhole blackhole) {
		UserHistory userHistory = gsonState.GSON.fromJson(state.gson_json, UserHistory.class);
		blackhole.consume(userHistory);
	}

	@Benchmark
	public void jackson_UserHistory_toJson(JacksonState jacksonState, UserState state, Blackhole blackhole)
			throws Exception {
		String str = jacksonState.objectMapper.writeValueAsString(state.userHistory);
		blackhole.consume(str);
	}

	@Benchmark
	public void jackson_UserHistory_toObject(JacksonState jacksonState, UserState state, Blackhole blackhole)
			throws Exception {
		UserHistory userHistory = jacksonState.objectMapper.readValue(state.jackson_json, UserHistory.class);
		blackhole.consume(userHistory);
	}

	@Benchmark
	public void moshi_UserHistory_toJson(UserState state, Blackhole blackhole) throws Exception {
		String str = MoshiState.userHistoryAdapter.toJson(state.userHistory);
		blackhole.consume(str);
	}

	@Benchmark
	public void moshi_UserHistory_toObject(UserState state, Blackhole blackhole) throws Exception {
		UserHistory userHistory = MoshiState.userHistoryAdapter.fromJson(state.moshi_json);
		blackhole.consume(userHistory);
	}*/
}
