package com.epam.gateway.client;

import com.epam.gateway.dto.OrderDto;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceFallbackImpl implements OrderService{

  @Override
  public String makeOrder(OrderDto order) {
    return "Can't create order, please try again later";
  }

  @Override
  public String checkOrder(Long clientId, Long orderId) {
    return "Unable to check the order, please try again later";
  }
}
