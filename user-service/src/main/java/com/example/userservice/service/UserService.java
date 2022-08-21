package com.example.userservice.service;

import com.example.userservice.Entity.UserEntity;
import com.example.userservice.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();
}
