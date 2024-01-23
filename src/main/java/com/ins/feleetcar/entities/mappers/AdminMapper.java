package com.ins.feleetcar.entities.mappers;

import com.ins.feleetcar.entities.Admin;
import com.ins.feleetcar.entities.dtos.AdminDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AdminMapper {
    AdminMapper ADMIN_MAPPER = Mappers.getMapper(AdminMapper.class);
    AdminDto toDto(Admin admin);
    Admin toEntity(AdminDto adminDto);
}
