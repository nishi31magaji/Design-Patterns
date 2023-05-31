package com.javatechie.saga.commons.events;

import java.util.Date;
import java.util.UUID;

import com.javatechie.saga.commons.dto.PaymentRequestDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PaymentEvent implements Event {
	private UUID eventId = UUID.randomUUID();
	private Date eventDate = new Date();
	private PaymentRequestDTO paymentRequestDTO;
	private PaymentStatus paymentStatus;
	@Override
	public UUID getEventId() {
		// TODO Auto-generated method stub
		return eventId;
	}
	public PaymentEvent(PaymentRequestDTO paymentRequestDTO, PaymentStatus paymentStatus) {
		super();
		this.paymentRequestDTO = paymentRequestDTO;
		this.paymentStatus = paymentStatus;
	}
	@Override
	public Date getDate() {
		// TODO Auto-generated method stub
		return eventDate;
	}
}
