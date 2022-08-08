package com.example.springboot.art.design.mapper;

import com.example.springboot.art.design.dao.entity.UserEntity;
import com.example.springboot.art.design.dao.entity.UserSecurityEntity;
import com.example.springboot.art.design.model.UserDto;
import com.example.springboot.art.design.model.UserSecurityDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserSecurityMapper {
    UserSecurityMapper INSTANCE = Mappers.getMapper(UserSecurityMapper.class);

    @Mappings({
            @Mapping(source = "user_nickname", target = "user_nickname"),
            @Mapping(source = "user_password", target = "user_password"),

    })
    UserSecurityDto entityToDto(UserSecurityEntity userSecurityEntity);

    @Mappings({
            @Mapping(source = "user_nickname", target = "user_nickname"),
            @Mapping(source = "user_password", target = "user_password"),

    })
    UserSecurityEntity dtoToEntity(UserSecurityDto userSecurityDtoDto);
}
