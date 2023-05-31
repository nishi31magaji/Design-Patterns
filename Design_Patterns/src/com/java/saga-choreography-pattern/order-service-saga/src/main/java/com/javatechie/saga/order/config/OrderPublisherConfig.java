package com.javatechie.saga.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javatechie.saga.commons.events.OrderEvent;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

@Configuration
public class OrderPublisherConfig {
	
	@Bean
	public Sinks.Many<OrderEvent> orderSinks() {
		return Sinks.many().multicast().onBackpressureBuffer();
	}
	
	@Bean
	public Supplier<Flux<OrderEvent>> orderSupplier(Sinks.Many<OrderEvent> sinks){
		return sinks::asFlux;
	}
}
