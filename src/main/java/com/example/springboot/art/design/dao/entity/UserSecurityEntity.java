package com.example.springboot.art.design.dao.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_security")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSecurityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_nickname")
    private String user_nickname;
    @Column(name = "user_password")
    private String user_password;
}
