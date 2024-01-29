package com.ins.feleetcar.entities.mappers;


import com.ins.feleetcar.entities.Car;
import com.ins.feleetcar.entities.dtos.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarMapper CAR_MAPPER = Mappers.getMapper(CarMapper.class);
    CarDto toDto(Car mission);
    Car toEntity(CarDto missionDto);
}
