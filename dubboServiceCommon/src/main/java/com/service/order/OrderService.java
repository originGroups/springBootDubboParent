package com.service.order;

import com.bean.UserAddress;

import java.util.List;

/**
 * 订单服务
 */
public interface OrderService {

    /**
     * 根据用户id 初始化 订单
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);
}