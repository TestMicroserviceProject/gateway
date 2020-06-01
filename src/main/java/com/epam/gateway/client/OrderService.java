package com.epam.gateway.client;

import com.epam.gateway.dto.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "ORDERSERVICE", fallback = OrderServiceFallbackImpl.class)
public interface OrderService {

  @PostMapping("/order")
  String makeOrder(@RequestBody OrderDto order);

  @GetMapping("/order/{clientId}/{orderId}")
  String checkOrder(@PathVariable Long clientId, @PathVariable Long orderId);

}
