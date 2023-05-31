package com.javatechie.saga.payment.config;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.javatechie.saga.commons.events.OrderEvent;
import com.javatechie.saga.commons.events.OrderStatus;
import com.javatechie.saga.commons.events.PaymentEvent;
import com.javatechie.saga.payment.service.PaymentService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Configuration
public class PaymentConsumerConfig {
	@Autowired
	PaymentService paymentService;
	public Function<Flux<OrderEvent>, Flux<PaymentEvent>> paymentProcessor() {
			return orderEventFlux -> orderEventFlux.flatMap(this::processPayment);
	}
	
	private Mono<PaymentEvent> processPayment(OrderEvent orderEvent){
		 // get the user id
        // check the balance availability
        // if balance sufficient -> Payment completed and deduct amount from DB
        // if payment not sufficient -> cancel order event and update the amount in DB
		
		 if(OrderStatus.ORDER_CREATED.equals(orderEvent.getOrderRequestDTO())){
	            return  Mono.fromSupplier(()->this.paymentService.newOrderEvent(orderEvent));
	        }else{
	            return Mono.fromRunnable(()->this.paymentService.cancelOrderEvent(orderEvent));
	        }
	
	}

}
