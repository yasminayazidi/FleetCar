package com.ins.feleetcar.services;

import com.ins.feleetcar.entities.dtos.DriverDto;

import java.util.List;

public interface DriverService {
    String save(DriverDto driverDto);
    DriverDto driverFindByid(int id);
    List<DriverDto> findAllList ();
    String updateDriver(int id, DriverDto driverDto);
}
