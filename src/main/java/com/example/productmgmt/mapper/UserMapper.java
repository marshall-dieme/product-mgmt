package com.example.productmgmt.mapper;

import com.example.productmgmt.dto.StockDto;
import com.example.productmgmt.dto.UserDto;
import com.example.productmgmt.model.Stock;
import com.example.productmgmt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserMapper implements EntityMapper<UserDto, User>{

    @Autowired
    private StockMapper stockMapper;

    @Override
    public User toEntity(UserDto dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        List<Stock> stockList = stockMapper.toEntity(dto.getStocks());
        user.setStocks(stockList);
        return user;
    }

    @Override
    public UserDto toDto(User entity) {
        UserDto dto = new UserDto();
        dto.setId(entity.getId());
        dto.setUsername(entity.getUsername());
        dto.setPassword(entity.getPassword());
        List<StockDto> dtos = stockMapper.toDto(entity.getStocks());
        dto.setStocks(dtos);
        return dto;
    }

    @Override
    public List<User> toEntity(List<UserDto> dtoList) {
        List<User> users = new ArrayList<>();
        for (UserDto dto : dtoList) {
            User user = toEntity(dto);
            users.add(user);
        }
        return users;
    }

    @Override
    public List<UserDto> toDto(List<User> entityList) {
        List<UserDto> dtoList = new ArrayList<>();
        for (User user : entityList) {
            UserDto dto = toDto(user);
            dtoList.add(dto);
        }
        return dtoList;
    }

}
