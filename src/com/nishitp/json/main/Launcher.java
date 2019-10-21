package com.nishitp.json.main;

import com.nishitp.json.jmh.state.GsonState;
import com.nishitp.json.jmh.state.JacksonState;
import com.nishitp.json.jmh.state.MoshiState;
import com.nishitp.json.jmh.state.ShipmentOrderState;
import com.nishitp.json.jmh.state.TweetState;
import com.nishitp.json.jmh.state.UserState;

public class Launcher {

	public static void main(String[] args) throws Exception {
		// org.openjdk.jmh.Main.main(args);
		GsonState gsonState = new GsonState();
		JacksonState jacksonState = new JacksonState();

		TweetState tweetState = new TweetState();
		ShipmentOrderState shipmentOrderState = new ShipmentOrderState();
		UserState userState = new UserState();

		String tweetGsonLength = gsonState.GSON.toJson(tweetState.tweet);
		System.out.println("Tweet Gson Length : " + tweetGsonLength.length());

		String shipmentOrderGsonLength = gsonState.GSON.toJson(shipmentOrderState.order);
		System.out.println("ShipmentOrder Gson Length : " + shipmentOrderGsonLength.length());

		String userHistoryGsonLength = gsonState.GSON.toJson(userState.userHistory);
		System.out.println("UserHistory Gson Length : " + userHistoryGsonLength.length());

		String tweetJacksonLength = jacksonState.objectMapper.writeValueAsString(tweetState.tweet);
		System.out.println("Tweet Jackson Length : " + tweetJacksonLength.length());

		String shipmentOrderJacksonLength = jacksonState.objectMapper.writeValueAsString(shipmentOrderState.order);
		System.out.println("ShipmentOrder Jackson Length : " + shipmentOrderJacksonLength.length());

		String userHistoryLength = gsonState.GSON.toJson(userState.userHistory);
		System.out.println("UserHistory Jackson Length : " + userHistoryLength.length());

		String tweetMoshiLength = MoshiState.tweetAdapter.toJson(tweetState.tweet);
		System.out.println("Tweet Moshi Length : " + tweetMoshiLength.length());

		String shipmentOrderMoshiLength = MoshiState.shipmentAdapter.toJson(shipmentOrderState.order);
		System.out.println("ShipmentOrder Moshi Length : " + shipmentOrderMoshiLength.length());

		String userHistoryMoshiLength = MoshiState.userHistoryAdapter.toJson(userState.userHistory);
		System.out.println("UserHistory Moshi Length : " + userHistoryMoshiLength.length());
	}

}
