package com.BSTU.ChupersAvia.service;

import com.BSTU.ChupersAvia.entity.OrderItem;
import com.BSTU.ChupersAvia.entity.filters.SearchFilter;
import org.aspectj.weaver.ast.Or;

import java.util.List;

public interface OrderItemService {
    OrderItem save(OrderItem orderItem);
    List<OrderItem> getOrderItemList();
    OrderItem getOrderItemById(Long id);
    List<OrderItem> findOrderItemByFilter(SearchFilter searchFilter);
}
