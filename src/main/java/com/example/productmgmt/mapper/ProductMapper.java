package com.example.productmgmt.mapper;

import com.example.productmgmt.dto.ProductDto;
import com.example.productmgmt.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductMapper implements EntityMapper<ProductDto, Product>{
    @Override
    public Product toEntity(ProductDto dto) {
        return null;
    }

    @Override
    public ProductDto toDto(Product entity) {
        return null;
    }

    @Override
    public List<Product> toEntity(List<ProductDto> dtoList) {
        return null;
    }

    @Override
    public List<ProductDto> toDto(List<Product> entityList) {
        return null;
    }

}
