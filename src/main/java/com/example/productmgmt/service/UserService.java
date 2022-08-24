package com.example.productmgmt.service;

import com.example.productmgmt.dto.StockDto;
import com.example.productmgmt.dto.UserDto;
import com.example.productmgmt.mapper.UserMapper;
import com.example.productmgmt.model.Stock;
import com.example.productmgmt.model.User;
import com.example.productmgmt.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private UserMapper mapper;

    public UserDto save(UserDto userDto) {
        //User user = mapper.toEntity(userDto);
        //User user1 = repo.save(user);
        //return mapper.toDto(user1);
        return mapper.toDto(repo.save(mapper.toEntity(userDto)));
    }

    public void deleteById(long id) {
        repo.deleteById(id);
    }

    public UserDto findById(long id) {
        User user = repo.findById(id).get();

        return user != null ? mapper.toDto(user) : null;
    }

    public List<UserDto> findAll() {
        //List<User> userList = repo.findAll();
        //List<UserDto> userDtoList = mapper.toDto(userList);
        return mapper.toDto(repo.findAll());
    }

    public UserDto update(UserDto userDto) {
        return mapper.toDto(repo.save(mapper.toEntity(userDto)));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Bad Credentials");
        }
        return user;
    }
}