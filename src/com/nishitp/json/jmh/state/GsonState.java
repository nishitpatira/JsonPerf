package com.nishitp.json.jmh.state;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import com.google.gson.Gson;

import lombok.NoArgsConstructor;

@State(Scope.Benchmark)
@NoArgsConstructor
public class GsonState {
	
	public Gson GSON = new Gson();
}
