package com.BSTU.ChupersAvia.service.impl;

import com.BSTU.ChupersAvia.entity.OrderItem;
import com.BSTU.ChupersAvia.entity.filters.SearchFilter;
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
    public OrderItem save(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    @Override
    public List<OrderItem> getOrderItemList() {
        return orderItemRepository.findAllBy();
    }

    @Override
    public OrderItem getOrderItemById(Long id) {
        return orderItemRepository.findByOrderItemId(id);
    }

    @Override
    public List<OrderItem> findOrderItemByFilter(SearchFilter searchFilter) {
        return orderItemRepository
                .findAllByAirportFrom_Address_CityAndAirportTo_Address_CityAndDateTo
                        (searchFilter.getCityFrom(),searchFilter.getCityTo(),searchFilter.getDateTo());

    }
}
