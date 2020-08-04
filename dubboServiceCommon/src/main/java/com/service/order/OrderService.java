package com.service.order;

/**
 * 订单服务
 */
public interface OrderService {

    /**
     * 根据用户id 初始化 订单
     * @param userId
     */
    public void initOrder(String userId);
}