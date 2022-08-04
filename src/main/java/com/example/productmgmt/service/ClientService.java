package com.example.productmgmt.service;

import com.example.productmgmt.dto.ClientDto;
import com.example.productmgmt.mapper.ClientMapper;
import com.example.productmgmt.model.Client;
import com.example.productmgmt.repository.ClientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ClientService {

    public ClientDto save(ClientDto clientDto) {
        return null;
    }

    public void deleteById(long id) {

    }

    public ClientDto findById(long id) {
        return null;
    }

    public List<ClientDto> findAll() {
        return null;
    }

    public ClientDto update(ClientDto clientDto, long id) {
        return null;
    }
}