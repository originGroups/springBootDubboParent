package com.service.impl;


import com.bean.UserAddress;
import com.service.order.OrderService;
import com.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1.将服务提供者注册到注册中心
 *      a.导入dubbo依赖
 * 2.让服务消费者到注册中心订阅服务提供者的服务地址
 *
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    public void initOrder(String userId) {

        List<UserAddress> userAddressList = userService.qryUserAddressList(userId);
        System.out.println(userAddressList);
    }
}
