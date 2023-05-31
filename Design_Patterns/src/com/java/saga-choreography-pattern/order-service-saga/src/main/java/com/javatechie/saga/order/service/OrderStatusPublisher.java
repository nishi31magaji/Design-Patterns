package com.javatechie.saga.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.saga.commons.dto.OrderRequestDTO;
import com.javatechie.saga.commons.events.OrderEvent;
import com.javatechie.saga.commons.events.OrderStatus;

import reactor.core.publisher.Sinks;

@Service
public class OrderStatusPublisher {
	@Autowired
	private Sinks.Many<OrderEvent> orderSinks;
	
	public void publishOrderEvent(OrderRequestDTO orderRequestDTO,OrderStatus orderStatus) {
		OrderEvent orderEvent = new OrderEvent(orderRequestDTO,orderStatus);
		orderSinks.tryEmitNext(orderEvent);
		
	}
}
