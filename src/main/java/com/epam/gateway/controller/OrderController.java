package com.epam.gateway.controller;

import com.epam.gateway.client.OrderService;
import com.epam.gateway.dto.OrderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

  private final OrderService orderService;

  @PostMapping("/order")
  public String makeOrder(@RequestBody OrderDto order) {
    return orderService.makeOrder(order);
  }

  @GetMapping("/order/{clientId}/{orderId}")
  public String checkOrder(@PathVariable Long clientId, @PathVariable Long orderId) {
    return orderService.checkOrder(clientId, orderId);
  }

}
