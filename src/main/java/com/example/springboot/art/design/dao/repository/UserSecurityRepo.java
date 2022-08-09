package com.example.springboot.art.design.dao.repository;

import com.example.springboot.art.design.dao.entity.UserSecurityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSecurityRepo extends JpaRepository<UserSecurityEntity, Integer>{

//    UserSecurityEntity findByUser_nickname(String name);
}
