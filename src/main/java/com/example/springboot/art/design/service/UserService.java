package com.example.springboot.art.design.service;

import com.example.springboot.art.design.dao.entity.UserSecurityEntity;
import com.example.springboot.art.design.dao.repository.UserRepo;
import com.example.springboot.art.design.dao.repository.UserSecurityRepo;
import com.example.springboot.art.design.mapper.UserMapper;
import com.example.springboot.art.design.mapper.UserSecurityMapper;
import com.example.springboot.art.design.model.UserDto;
import com.example.springboot.art.design.model.UserSecurityDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
//    private UserRepo userRepo;
//    private UserSecurityRepo userSecurityRepo;
//
//    public UserService(UserRepo userRepo, UserSecurityRepo userSecurityRepo) {
//        this.userRepo = userRepo;
//        this.userSecurityRepo = userSecurityRepo;
//    }
//
//    public List<UserDto> getUsers() {
//        var userEntity = userRepo.findAll();
//        var userDto = userEntity.stream()
//                .map(UserMapper.INSTANCE::entityToDto)
//                .collect(Collectors.toList());
//        return userDto;
//    }
//
//    public UserDto getUserById(Integer id) {
//        var userEntity = userRepo.findById(id).orElseThrow();
//        return UserMapper.INSTANCE.entityToDto(userEntity);
//    }
//
//    public UserDto findByUser_name(String name) {
//        var userEntity = userRepo.findByUser_name(name);
//        return UserMapper.INSTANCE.entityToDto(userEntity);
//    }
//
//    public UserSecurityDto findByUser_nickname(String name) {
//        var userSecurityEntity = userSecurityRepo.findByUser_nickname(name);
//        return UserSecurityMapper.INSTANCE.entityToDto(userSecurityEntity);
//    }
//
//    public void createUser(UserDto userDto) {
//        var userEntity = UserMapper.INSTANCE.dtoToEntity(userDto);
//        userRepo.save(userEntity);
//        UserMapper.INSTANCE.entityToDto(userEntity);
//    }
//
//    public UserDto editUser(Integer id, UserDto userDto) {
//        var exist = userRepo.existsById(id);
//        if (!exist) {
//            throw new RuntimeException("Its Error");
//        }
//        var userEntity = UserMapper.INSTANCE.dtoToEntity(userDto);
//        userEntity.setUser_name(userDto.getUser_name());
//        userEntity.setUser_surname(userDto.getUser_surname());
//        userEntity.setUser_age(userDto.getUser_age());
//        userEntity.setUser_phone_number(userDto.getUser_phone_number());
//        userEntity.setUser_mail(userDto.getUser_mail());
//        userRepo.save(userEntity);
//        return UserMapper.INSTANCE.entityToDto(userEntity);
//    }
//
//    public void deleteById(Integer id){
//        userRepo.deleteById(id);
//    }
}
