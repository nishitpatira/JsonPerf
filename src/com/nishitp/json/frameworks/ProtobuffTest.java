package com.nishitp.json.frameworks;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import com.nishitp.json.jmh.state.JacksonState;
import com.nishitp.json.jmh.state.ProtoBuffState;
import com.nishitp.json.jmh.state.ShipmentOrderState;

import NishitDemo.ShipmentOrder;

@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 2, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10)
@Fork(warmups = 1, value = 3)
public class ProtobuffTest {
	
	@Benchmark
	public void testProtobuffSerialization(ProtoBuffState state) throws Exception {
		state.orders.writeTo(state.fos);
	}

	@Benchmark
	public void testProtobuffDeserialization(ProtoBuffState state, Blackhole hole) throws Exception {
		final FileInputStream fis = new FileInputStream("/Users/npatira/Documents/proto.txt");
		final ShipmentOrder.ShipmentOrders reconstructedOrders = ShipmentOrder.ShipmentOrders.parseFrom(fis);
		fis.close();
		hole.consume(reconstructedOrders);
	}

	@Benchmark
	public void testJsonSerialization(JacksonState jacksonState, ShipmentOrderState state, Blackhole blackhole)
			throws Exception {
		jacksonState.objectMapper.writeValue(new File("/Users/npatira/Documents/jackson.json"), state.order);
	}

	@Benchmark
	public void testJsonDeserialization(JacksonState jacksonState, ShipmentOrderState state, Blackhole blackhole)
			throws Exception {
		com.nishitp.json.model.ShipmentOrder shipmentOrder = jacksonState.objectMapper.readValue(
				new File("/Users/npatira/Documents.jackson.json"), com.nishitp.json.model.ShipmentOrder.class);
		blackhole.consume(shipmentOrder);
	}

}
