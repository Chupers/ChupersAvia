package com.BSTU.ChupersAvia.service;

import com.BSTU.ChupersAvia.entity.OrderItem;

import java.util.List;

public interface OrderItemService {
    void save(OrderItem orderItem);
    List<OrderItem> getOrderItemList();
}
