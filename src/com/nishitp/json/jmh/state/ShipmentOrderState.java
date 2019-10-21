package com.nishitp.json.jmh.state;

import java.time.Instant;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import com.nishitp.json.model.ShipmentOrder;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@State(Scope.Benchmark)
public class ShipmentOrderState {

	public final ShipmentOrder order = ShipmentOrder.builder().shipmentId(33221234l).sourceWarehouse("BLR")
			.destinationWarehouse("HYD").shipDate(Instant.now()).noOfItems(4).orderId(4433215876l).sellerName("AMAZON")
			.sellerId(5424l).customerId(8875l).priority(true).build();

	public final String jackson_shipment_json = "{\"shipmentId\":33221234,\"sourceWarehouse\":\"BLR\",\"destinationWarehouse\":\"HYD\",\"shipDate\":1571581072223,\"noOfItems\":4,\"orderId\":4433215876,\"sellerName\":\"AMAZON\",\"sellerId\":5424,\"customerId\":8875,\"priority\":true}";
	public final String gson_shipment_json = "{\"shipmentId\":33221234,\"sourceWarehouse\":\"BLR\",\"destinationWarehouse\":\"HYD\",\"shipDate\":{\"seconds\":1571592277,\"nanos\":841000000},\"noOfItems\":4,\"orderId\":4433215876,\"sellerName\":\"AMAZON\",\"sellerId\":5424,\"customerId\":8875,\"priority\":true}";
	public final String moshi_shipment_json = "{\"customerId\":8875,\"destinationWarehouse\":\"HYD\",\"noOfItems\":4,\"orderId\":4433215876,\"priority\":true,\"sellerId\":5424,\"sellerName\":\"AMAZON\",\"shipDate\":\"1571581560443\",\"shipmentId\":33221234,\"sourceWarehouse\":\"BLR\"}";

}
