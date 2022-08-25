package com.example.productmgmt.service;

import com.example.productmgmt.dto.ProductDto;
import com.example.productmgmt.mapper.ProductMapper;
import com.example.productmgmt.model.Product;
import com.example.productmgmt.repository.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public ProductDto save(ProductDto productDto) {
        return null;
    }

    public void deleteById(long id) {

    }

    public ProductDto findById(long id) {
        return null;
    }

    public List<Product> findAll() {
        return repo.findAll();
    }

    public ProductDto update(ProductDto productDto, long id) {
        return null;
    }
}