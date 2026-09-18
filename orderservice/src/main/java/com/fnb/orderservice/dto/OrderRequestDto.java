package com.fnb.orderservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderRequestDto {

    private long customerId;

    private List<OrderItemRequestDto> items;
}
