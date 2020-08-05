package com.service.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.bean.UserAddress;
import com.service.order.OrderService;
import com.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1.将服务提供者注册到注册中心
 *      a.导入spring boot - dubbo依赖
 *      b。引入dubbo其他依赖
 * 2.让服务消费者到注册中心订阅服务提供者的服务地址
 *
 */
@Service   //应该引入dubbo的service,如果不是作为服务提供者向注册中心注册服务,那么service注解可以使用spring的注解
@Component //springboot 组件
public class OrderServiceImpl implements OrderService {

    //@Autowired
    @Reference //通过dubbo的该注解从注册中心发现并订阅服务
    private UserService userService;

    public List<UserAddress> initOrder(String userId) {

        List<UserAddress> userAddressList = userService.qryUserAddressList(userId);
        return userAddressList;
    }
}
