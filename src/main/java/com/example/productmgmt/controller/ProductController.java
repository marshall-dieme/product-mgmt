package com.example.productmgmt.controller;

import com.example.productmgmt.dto.ProductDto;
import com.example.productmgmt.model.Product;
import com.example.productmgmt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated ProductDto productDto) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> findById(@PathVariable("id") long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") long id) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated ProductDto productDto, @PathVariable("id") long id) {
        return null;
    }
}