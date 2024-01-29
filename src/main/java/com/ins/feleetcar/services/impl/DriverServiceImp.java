package com.ins.feleetcar.services.impl;

import com.ins.feleetcar.entities.Driver;
import com.ins.feleetcar.entities.dtos.DriverDto;
import com.ins.feleetcar.entities.mappers.DriverMapper;
import com.ins.feleetcar.repositories.DriverRepository;
import com.ins.feleetcar.services.DriverService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DriverServiceImp implements DriverService {
    private DriverRepository driverRepository;
    private DriverMapper driverMapper;

    public DriverServiceImp(DriverRepository driverRepository, DriverMapper driverMapper) {
        this.driverRepository = driverRepository;
        this.driverMapper = driverMapper;
    }

    // mapper Driver
    Driver getEntity(DriverDto driverDto){
        return  driverMapper.toEntity(driverDto);
    }
    DriverDto getDto(Driver driver){
        return driverMapper.toDto(driver);
    }


    @Override
    public String save(DriverDto driverDto) {
         driverRepository.save(getEntity(driverDto));
         return "Driver add successfully";
    }

    @Override
    public DriverDto driverFindByid(int id) {
        return getDto(driverRepository.findById(id).get());
    }

    @Override
    public List<DriverDto> findAllList() {
        return driverRepository.findAll().stream()
                .map(
                        (driver)->
                            getDto(driver)

                ).toList();
    }

    @Override
    public String updateDriver(int id, DriverDto driverDto) {
        if (driverRepository.existsById(id)) {
            driverRepository.save(getEntity(driverDto));
            return "Driver update successfully";
        } else {
            return "Driver update faillure";
        }
    }
}
