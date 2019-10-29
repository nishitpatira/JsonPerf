package com.nishitp.json.jmh.state;

import java.io.FileOutputStream;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;

import NishitDemo.*;
import lombok.NoArgsConstructor;

@State(Scope.Benchmark)
@NoArgsConstructor
public class ProtoBuffState{

	public final ShipmentOrder.ShipmentOrders orders = ShipmentOrder.ShipmentOrders.newBuilder().setShipmentId(123l)
			.setShourceWarehouse("BLR").setDestinationWarehouse("HYD").setNoOfItems(4).setOrderId(443454427l)
			.setSellerName("AMAZON").setSellerId(765432345l).setCustomerId(7654356l).setPriority(true).build();
	
	public FileOutputStream fos = null;
	
	@Setup
	public void setup() throws Exception{
		fos = new FileOutputStream("/Users/npatira/Documents/proto.txt");
	}
	
	@TearDown
	public void tearDown() throws Exception{
		fos.close();
	}
}
