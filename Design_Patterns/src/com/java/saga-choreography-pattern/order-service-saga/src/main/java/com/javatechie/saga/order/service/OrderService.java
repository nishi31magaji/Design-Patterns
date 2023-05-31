package com.javatechie.saga.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javatechie.saga.commons.dto.OrderRequestDTO;
import com.javatechie.saga.commons.events.OrderStatus;
import com.javatechie.saga.order.entity.PurchaseOrder;
import com.javatechie.saga.order.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderStatusPublisher orderStatusPublisher;

	@Transactional
	public PurchaseOrder createOrder(OrderRequestDTO orderRequestDTO) {

		PurchaseOrder order = orderRepository.save(converDtoToEntity(orderRequestDTO));
		orderRequestDTO.setOrderId(order.getId());

		// produce kafka event with status as ORDER_CREATED
		orderStatusPublisher.publishOrderEvent(orderRequestDTO, OrderStatus.ORDER_CREATED);
		return order;
	}
	
	public List<PurchaseOrder>getAllOrder(){
		return orderRepository.findAll();
	}

	private PurchaseOrder converDtoToEntity(OrderRequestDTO orderRequestDTO) {
		PurchaseOrder purchaseOrder = new PurchaseOrder();
		purchaseOrder.setId(orderRequestDTO.getUserId());
		purchaseOrder.setProductId(orderRequestDTO.getProductId());
		purchaseOrder.setPrice(orderRequestDTO.getAmount());
		purchaseOrder.setOrderStatus(OrderStatus.ORDER_CREATED);
		return purchaseOrder;
	}
}
