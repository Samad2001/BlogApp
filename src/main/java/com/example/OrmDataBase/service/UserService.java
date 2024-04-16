package com.example.OrmDataBase.service;

import com.example.OrmDataBase.model.UserDto;
import com.example.OrmDataBase.model.entity.User;

import java.util.List;

public interface UserService {

    List<UserDto> getAll();
    UserDto getByid(Integer id);
    User saveUser(User user);
    void deleteUser(Integer id);


}
