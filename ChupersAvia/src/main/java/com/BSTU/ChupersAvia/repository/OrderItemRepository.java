package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.OrderItem;
import org.hibernate.criterion.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem,Long> {
    OrderItem findByOrderItemId(Long id);
    List<OrderItem> findAllBy();
}
