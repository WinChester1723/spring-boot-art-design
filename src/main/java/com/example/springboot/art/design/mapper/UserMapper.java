package com.example.springboot.art.design.mapper;

import com.example.springboot.art.design.dao.entity.UserEntity;
import com.example.springboot.art.design.model.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mappings({
            @Mapping(source = "user_name", target = "user_name"),
            @Mapping(source = "user_surname", target = "user_surname"),
            @Mapping(source = "user_age", target = "user_age"),
            @Mapping(source = "user_phone_number", target = "user_phone_number"),
            @Mapping(source = "user_mail", target = "user_mail")

    })
    UserDto entityToDto(UserEntity userEntity);

    @Mappings({
            @Mapping(source = "user_name", target = "user_name"),
            @Mapping(source = "user_surname", target = "user_surname"),
            @Mapping(source = "user_age", target = "user_age"),
            @Mapping(source = "user_phone_number", target = "user_phone_number"),
            @Mapping(source = "user_mail", target = "user_mail")

    })
    UserEntity dtoToEntity(UserDto userDto);
}
