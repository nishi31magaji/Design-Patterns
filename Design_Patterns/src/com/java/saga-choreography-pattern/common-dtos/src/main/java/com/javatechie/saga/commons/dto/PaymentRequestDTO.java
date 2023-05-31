package com.javatechie.saga.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequestDTO {
private Integer userId;
private Integer orderId;
private Integer amount;

}
