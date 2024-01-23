package com.ins.feleetcar.services;

import com.ins.feleetcar.entities.dtos.CarDto;

import java.util.List;

public interface CarService {
    String save(CarDto carDto);
    CarDto carFindByid(int id);
    List<CarDto> findAllList ();
    String updateCar(int id, CarDto carDto);
}
