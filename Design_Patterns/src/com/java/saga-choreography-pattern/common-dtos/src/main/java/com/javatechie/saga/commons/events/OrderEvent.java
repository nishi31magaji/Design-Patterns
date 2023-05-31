package com.javatechie.saga.commons.events;

import java.util.Date;
import java.util.UUID;

import com.javatechie.saga.commons.dto.OrderRequestDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class OrderEvent implements Event {

	private OrderRequestDTO orderRequestDTO;
	private OrderStatus orderStatus;
	private UUID eventId = UUID.randomUUID();
	private Date eventDate = new Date();

	@Override
	public UUID getEventId() {
		// TODO Auto-generated method stub
		return eventId;
	}

	@Override
	public Date getDate() {
		// TODO Auto-generated method stub
		return eventDate;
	}

	public OrderEvent(OrderRequestDTO orderRequestDTO, OrderStatus orderStatus) {
		super();
		this.orderRequestDTO = orderRequestDTO;
		this.orderStatus = orderStatus;
	}
	
	
}
