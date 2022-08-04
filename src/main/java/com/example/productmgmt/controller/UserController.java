package com.example.productmgmt.controller;

import com.example.productmgmt.dto.UserDto;
import com.example.productmgmt.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/user")
@RestController
public class UserController {

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated UserDto userDto) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> findById(@PathVariable("id") long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") long id) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> findAll() {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated UserDto userDto, @PathVariable("id") long id) {
        return null;
    }
}