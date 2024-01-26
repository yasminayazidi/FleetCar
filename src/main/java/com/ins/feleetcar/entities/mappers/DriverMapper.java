package com.ins.feleetcar.entities.mappers;

import com.ins.feleetcar.entities.Driver;
import com.ins.feleetcar.entities.dtos.DriverDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DriverMapper {
    DriverMapper DRIVER_MAPPER = Mappers.getMapper(DriverMapper.class);
    Driver toEntity(DriverDto driverDto);

    DriverDto toDto(Driver driver);
}
