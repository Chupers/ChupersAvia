package com.BSTU.ChupersAvia.repository;

import com.BSTU.ChupersAvia.entity.OrderItem;
import org.hibernate.criterion.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem,Long> {
    OrderItem findByOrderItemId(Long id);
    List<OrderItem> findAllBy();
    List<OrderItem> findAllByAirportFrom_Address_CityAndAirportTo_Address_CityAndDateTo(String From, String to, Date timestamp);
}

