package com.ins.feleetcar.services.impl;

import com.ins.feleetcar.entities.Car;
import com.ins.feleetcar.entities.Driver;
import com.ins.feleetcar.entities.Mission;
import com.ins.feleetcar.entities.dtos.CarDto;
import com.ins.feleetcar.entities.dtos.DriverDto;
import com.ins.feleetcar.entities.dtos.MissionDto;
import com.ins.feleetcar.entities.dtos.MissionInsertDto;
import com.ins.feleetcar.entities.mappers.CarMapper;
import com.ins.feleetcar.entities.mappers.DriverMapper;
import com.ins.feleetcar.entities.mappers.MissionMapper;
import com.ins.feleetcar.repositories.CarRepository;
import com.ins.feleetcar.repositories.DriverRepository;
import com.ins.feleetcar.repositories.MissionRepository;
import com.ins.feleetcar.services.MissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MissionServiceImp implements MissionService {
    private MissionRepository missionRepository;
    private DriverRepository driverRepository;
    private CarRepository carRepository;
    private MissionMapper missionMapper;
    private DriverMapper driverMapper;
    private CarMapper carMapper;

    public MissionServiceImp(MissionRepository missionRepository, DriverRepository driverRepository, CarRepository carRepository, MissionMapper missionMapper, DriverMapper driverMapper, CarMapper carMapper) {
        this.missionRepository = missionRepository;
        this.driverRepository = driverRepository;
        this.carRepository = carRepository;
        this.missionMapper = missionMapper;
        this.driverMapper = driverMapper;
        this.carMapper = carMapper;
    }

    // mapper Mission
    Mission getEntity(MissionDto missionDto){
        return  missionMapper.toEntity(missionDto);
    }
    MissionDto getDto(Mission mission){
        return missionMapper.toDto(mission);
    }
    Driver getEntityDriver(DriverDto driverDto){
        return  driverMapper.toEntity(driverDto);
    }
    DriverDto getDtoDriver(Driver driver){
        return driverMapper.toDto(driver);
    }
    Car getEntityCar(CarDto carDto){
        return  carMapper.toEntity(carDto);
    }
    CarDto getDtoCar(Car car){
        return carMapper.toDto(car);
    }

    @Override
    public String save(MissionInsertDto missionInsertDto) {
        MissionDto missionDto =new MissionDto();
        BeanUtils.copyProperties(missionInsertDto,missionDto);
        Driver driver =driverRepository.findById(missionInsertDto.getDriverID()).get();
        Car car =carRepository.findById(missionInsertDto.getCarID()).get();
        missionDto.setDriverDto(getDtoDriver(driver));
        missionDto.setCarDto(getDtoCar(car));
         missionRepository.save(getEntity(missionDto));
         return "Mission add successfully";
    }

    @Override
    public MissionDto missionFindByid(int id) {
        return getDto(missionRepository.findById(id).get());
    }

    @Override
    public List<MissionDto> findAllList() {
        return missionRepository.findAll().stream()
                .map(
                        (mission)->
                            getDto(mission)

                ).toList();
    }

    @Override
    public String updateMission(int id, MissionDto missionDto) {
        if (missionRepository.existsById(id)) {
            missionRepository.save(getEntity(missionDto));
            return "Mission update successfully";
        } else {
            return "Mission update faillure";
        }
    }
}
