package com.example.productmgmt.service;

import com.example.productmgmt.dto.StockDto;
import com.example.productmgmt.mapper.StockMapper;
import com.example.productmgmt.model.Stock;
import com.example.productmgmt.repository.StockRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StockService {

    public StockDto save(StockDto stockDto) {
        return null;
    }

    public void deleteById(long id) {

    }

    public StockDto findById(long id) {
        return null;
    }

    public List<StockDto> findAll() {
        return null;
    }

    public StockDto update(StockDto stockDto, long id) {
        return null;
    }
}