package com.nishitp.json.jmh.state;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import lombok.NoArgsConstructor;

@State(Scope.Benchmark)
@NoArgsConstructor
public class JacksonState {
	
	public final ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

}
