package com.nishitp.json.model;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Getter
@ToString
public final class ShipmentOrder {
	
	private final long shipmentId;
	private final String sourceWarehouse;
	private final String destinationWarehouse;
	private final Instant shipDate;
	private final int noOfItems;
	private final long orderId;
	private final String sellerName;
	private final long sellerId;
	private final long customerId;
	private final boolean priority;

}
