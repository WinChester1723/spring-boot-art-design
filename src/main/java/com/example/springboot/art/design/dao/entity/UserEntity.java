package com.example.springboot.art.design.dao.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "user_surname")
    private String user_surname;
    @Column(name = "user_age")
    private Integer user_age;
    @Column(name = "user_phone_number")
    private String user_phone_number;
    @Column(name = "user_mail")
    private String user_mail;

//    tut dumayu sdelat manytomany
//    sama db na onetoone ne srabotaet
//    @OneToOne
//    @MapsId
//    @JoinColumn(name = "id")
//    private UserSecurityEntity userSecurityEntity;
}
