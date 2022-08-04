package com.example.productmgmt.mapper;

import com.example.productmgmt.dto.OrderDto;
import com.example.productmgmt.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderMapper implements EntityMapper<OrderDto, Order>{
    @Override
    public Order toEntity(OrderDto dto) {
        return null;
    }

    @Override
    public OrderDto toDto(Order entity) {
        return null;
    }

    @Override
    public List<Order> toEntity(List<OrderDto> dtoList) {
        return null;
    }

    @Override
    public List<OrderDto> toDto(List<Order> entityList) {
        return null;
    }

}
