package com.controller;

import com.bean.UserAddress;
import com.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam(value = "userId",required = true) String userId) {
        List<UserAddress> userAddresses = orderService.initOrder(userId);
        return userAddresses;
    }
}
