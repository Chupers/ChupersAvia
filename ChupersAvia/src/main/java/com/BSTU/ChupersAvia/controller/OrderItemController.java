package com.BSTU.ChupersAvia.controller;

import com.BSTU.ChupersAvia.entity.OrderItem;
import com.BSTU.ChupersAvia.entity.dataTransferObjects.OrderItemDTO;
import com.BSTU.ChupersAvia.entity.filters.SearchFilter;
import com.BSTU.ChupersAvia.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 10000)
@RestController
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
    @GetMapping("/findById")
    OrderItem findById(@RequestParam("id") Long id){
        return orderItemService.getOrderItemById(id);
    }
    @PostMapping("/save")
    OrderItem saveOrderItem(@RequestBody OrderItem orderItem){
        return orderItemService.save(orderItem);
    }
    @PostMapping("/findOrderItem")
    List<OrderItem> findOrderItemList(@RequestBody SearchFilter searchFilter){
        return orderItemService.findOrderItemByFilter(searchFilter);
    }
}
