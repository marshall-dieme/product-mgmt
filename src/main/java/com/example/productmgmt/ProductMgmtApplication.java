package com.example.productmgmt;

import com.example.productmgmt.dto.UserDto;
import com.example.productmgmt.model.User;
import com.example.productmgmt.repository.UserRepository;
import com.example.productmgmt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductMgmtApplication implements CommandLineRunner {

    @Autowired
    private UserRepository repo;

    @Autowired
    private UserService service;

    public static void main(String[] args) {
        SpringApplication.run(ProductMgmtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setUsername("marshall");
        user.setPassword("dieme");

        repo.save(user);

        UserDto dto = new UserDto();
        dto.setUsername("Sougou");
        dto.setPassword("malick");

        service.save(dto);
    }
}
