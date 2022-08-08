package com.example.springboot.art.design.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSecurityDto {
    private Integer id;
    private String user_nickname;
    private String user_password;
}
