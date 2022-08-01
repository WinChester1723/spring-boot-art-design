package com.example.springboot.art.design.dao.repository;

import com.example.springboot.art.design.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {
}
