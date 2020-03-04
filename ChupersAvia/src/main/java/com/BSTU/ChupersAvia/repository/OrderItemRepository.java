package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.OrderItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends CrudRepository<Long, OrderItem> {
}
