package com.example.demo.services;


import com.example.demo.dtos.UserDto;

public interface UserService {

    //create user
    UserDto createUser(UserDto userDto);



    //get all users
    Iterable<UserDto> getAllUsers();

    // user service se related __


}
