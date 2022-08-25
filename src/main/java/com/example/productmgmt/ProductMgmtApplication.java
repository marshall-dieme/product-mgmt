package com.example.productmgmt;

import com.example.productmgmt.dto.UserDto;
import com.example.productmgmt.model.Product;
import com.example.productmgmt.model.User;
import com.example.productmgmt.repository.ProductRepository;
import com.example.productmgmt.repository.UserRepository;
import com.example.productmgmt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ProductMgmtApplication implements CommandLineRunner {

    @Autowired
    private UserRepository repo;
    @Autowired
    private ProductRepository repo2;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UserService service;

    public static void main(String[] args) {
        SpringApplication.run(ProductMgmtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setUsername("marshall");
        user.setPassword(encoder.encode("dieme"));
        user.setRoles("admin");

        repo.save(user);

        User dto = new User();
        dto.setUsername("Sougou");
        dto.setPassword(encoder.encode("malick"));
        dto.setRoles("user");

        repo.save(dto);

        List<Product> products = new ArrayList<>(
                Arrays.asList(
                        new Product("111", "Milk", "Good milk", 1500.0, 50),
                        new Product("222", "Sugar", "Good Sugar", 1800.0, 50),
                        new Product("333", "Candy", "Good Candy", 1200.0, 50),
                        new Product("444", "Flour", "Good Flour", 1000.0, 50)
                )
        );

        repo2.saveAll(products);
    }
}
