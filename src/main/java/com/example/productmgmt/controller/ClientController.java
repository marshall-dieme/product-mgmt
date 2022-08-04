package com.example.productmgmt.controller;

import com.example.productmgmt.dto.ClientDto;
import com.example.productmgmt.service.ClientService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/clients")
@RestController
public class ClientController {

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated ClientDto clientDto) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientDto> findById(@PathVariable("id") long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") long id) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<ClientDto>> findAll() {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated ClientDto clientDto, @PathVariable("id") long id) {
        return null;
    }
}