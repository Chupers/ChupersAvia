package com.BSTU.ChupersAvia.entity.dataTransferObjects;

import com.BSTU.ChupersAvia.entity.Company;
import com.BSTU.ChupersAvia.entity.OrderItem;
import com.BSTU.ChupersAvia.entity.Plane;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.util.List;

public class PlaneDTO {
    private Long planeId;
    private String planeModel;
    private CompanyDTO company;
    private int planeСapacity;
    List<OrderItemDTO> orderItemList;

    public PlaneDTO(){}

    public Long getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Long planeId) {
        this.planeId = planeId;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public void setPlaneModel(String planeModel) {
        this.planeModel = planeModel;
    }

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }

    public int getPlaneСapacity() {
        return planeСapacity;
    }

    public void setPlaneСapacity(int planeСapacity) {
        this.planeСapacity = planeСapacity;
    }

    public List<OrderItemDTO> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItemDTO> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
