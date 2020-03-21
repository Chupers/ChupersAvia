package com.BSTU.ChupersAvia.service;

import com.BSTU.ChupersAvia.entity.OrderItem;

import java.util.List;

public interface OrderItemService {
    OrderItem save(OrderItem orderItem);
    List<OrderItem> getOrderItemList();
    OrderItem getOrderItemById(Long id);
}
