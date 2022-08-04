package com.example.productmgmt.mapper;

import com.example.productmgmt.dto.ClientDto;
import com.example.productmgmt.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientMapper implements EntityMapper<ClientDto, Client>{
    @Override
    public Client toEntity(ClientDto dto) {
        return null;
    }

    @Override
    public ClientDto toDto(Client entity) {
        return null;
    }

    @Override
    public List<Client> toEntity(List<ClientDto> dtoList) {
        return null;
    }

    @Override
    public List<ClientDto> toDto(List<Client> entityList) {
        return null;
    }

}
