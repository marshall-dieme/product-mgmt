package com.example.productmgmt.mapper;

import com.example.productmgmt.dto.StockDto;
import com.example.productmgmt.dto.UserDto;
import com.example.productmgmt.model.Stock;
import com.example.productmgmt.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockMapper implements EntityMapper<StockDto, Stock>{
    @Override
    public Stock toEntity(StockDto dto) {
        return null;
    }

    @Override
    public StockDto toDto(Stock entity) {
        return null;
    }

    @Override
    public List<Stock> toEntity(List<StockDto> dtoList) {
        /*List<Stock> users = new ArrayList<>();
        for (StockDto dto : dtoList) {
            Stock stock = toEntity(dto);
            users.add(stock);
        }*/
        return null;
    }

    @Override
    public List<StockDto> toDto(List<Stock> entityList) {
        return null;
    }

}
