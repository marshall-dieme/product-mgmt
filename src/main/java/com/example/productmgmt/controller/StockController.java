package com.example.productmgmt.controller;

import com.example.productmgmt.dto.StockDto;
import com.example.productmgmt.service.StockService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/stock")
@RestController
public class StockController {

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated StockDto stockDto) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<StockDto> findById(@PathVariable("id") long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") long id) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<StockDto>> findAll() {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated StockDto stockDto, @PathVariable("id") long id) {
        return null;
    }
}