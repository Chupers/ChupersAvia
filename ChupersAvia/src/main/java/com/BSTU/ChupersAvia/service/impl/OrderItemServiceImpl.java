package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.entity.OrderItem;
import com.BSTU.ChupersAvia.repository.OrderItemRepository;
import com.BSTU.ChupersAvia.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public void save(OrderItem orderItem) {

    }

    @Override
    public List<OrderItem> getOrderItemList() {
        return null;
    }
}
