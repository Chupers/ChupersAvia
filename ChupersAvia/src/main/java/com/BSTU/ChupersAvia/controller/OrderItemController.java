package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.OrderItem;
import com.BSTU.ChupersAvia.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orderItem")
public class OrderItemController {
    private final OrderItemService orderItemService;

    @Autowired
    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @GetMapping("/getAll")
    List<OrderItem> getOrderItemList(){
        return orderItemService.getOrderItemList();
    }
    @PostMapping("/save")
    OrderItem saveOrderItem(@RequestBody OrderItem orderItem){
        return orderItemService.save(orderItem);
    }
}
