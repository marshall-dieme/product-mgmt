package com.example.productmgmt.controller;

import com.example.productmgmt.bean.LoginRequest;
import com.example.productmgmt.dto.UserDto;
import com.example.productmgmt.model.User;
import com.example.productmgmt.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private UserService service;

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private AuthenticationManager authenticationManager;
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

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        authenticate(request.getUsername(), request.getPassword());
        UserDetails userDetails = service.loadUserByUsername(request.getUsername());
        User user = (User) userDetails;
        logger.error(user.toString());
        return ResponseEntity.ok("Successfully connected");
    }

    private void authenticate(String username, String password) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password)
            );
        }catch (BadCredentialsException e){
            throw new BadCredentialsException("Invalid Username or password");
        }catch (DisabledException e){
            throw new DisabledException("An error has occur");
        }
    }


}