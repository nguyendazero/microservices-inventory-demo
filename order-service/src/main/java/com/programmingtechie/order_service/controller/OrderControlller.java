package com.programmingtechie.order_service.controller;

import com.programmingtechie.order_service.dto.OrderResquest;
import com.programmingtechie.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderControlller {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderResquest orderResquest){
        orderService.placeOrder(orderResquest);
        return "Order Placed Successfully";
    }
}
