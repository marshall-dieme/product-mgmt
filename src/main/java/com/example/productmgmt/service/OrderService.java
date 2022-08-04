package com.example.productmgmt.service;

import com.example.productmgmt.dto.OrderDto;
import com.example.productmgmt.mapper.OrderMapper;
import com.example.productmgmt.model.Order;
import com.example.productmgmt.repository.OrderRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class OrderService {

    public OrderDto save(OrderDto orderDto) {
        return null;
    }

    public void deleteById(long id){

    }

    public OrderDto findById(long id) {
        return null;
    }

    public List<OrderDto> findAll() {
        return null;
    }

    public OrderDto update(OrderDto orderDto, long id) {
        return null;
    }
}