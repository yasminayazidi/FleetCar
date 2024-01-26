package com.ins.feleetcar.controllers;

import com.ins.feleetcar.controllers.api.DriverApi;
import com.ins.feleetcar.entities.dtos.DriverDto;
import com.ins.feleetcar.services.DriverService;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DriverController implements DriverApi {
    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @Override
    public String save(DriverDto driverDto) {
        return driverService.save(driverDto);
    }

    @Override
    public DriverDto driverFindByid(int id) {
        return driverService.driverFindByid(id);
    }

    @Override
    public List<DriverDto> findAllList() {
        return driverService.findAllList();
    }

    @Override
    public String updateDriver(int id, DriverDto driverDto) {
        return driverService.updateDriver(id,driverDto);
    }
}
