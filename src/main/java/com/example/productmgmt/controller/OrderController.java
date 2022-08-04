package com.example.productmgmt.controller;

import com.example.productmgmt.dto.OrderDto;
import com.example.productmgmt.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/orders")
@RestController
public class OrderController {

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated OrderDto orderDto) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<OrderDto>> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDto> findById(@PathVariable("id") long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") long id) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated OrderDto orderDto, @PathVariable("id") long id) {
        return null;
    }
}