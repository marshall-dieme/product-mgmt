package com.example.productmgmt.controller;

import com.example.productmgmt.dto.UserDto;
import com.example.productmgmt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService service;
    @PostMapping
    public ResponseEntity<UserDto> save(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(service.save(userDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> findById(@PathVariable("id") long id) {
        //return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
        return ResponseEntity.ok(service.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") long id) {
        service.deleteById(id);
        return new ResponseEntity<>("Successfully deleted", HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.FOUND);
    }

    @PutMapping("")
    public ResponseEntity<UserDto> update(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(service.update(userDto));
    }
}