package com.ins.feleetcar.controllers;

import com.ins.feleetcar.controllers.api.MissionApi;
import com.ins.feleetcar.entities.dtos.MissionDto;
import com.ins.feleetcar.entities.dtos.MissionInsertDto;
import com.ins.feleetcar.services.MissionService;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class MissionController implements MissionApi {
    private final MissionService missionService;

    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    @Override
    public String save(MissionInsertDto missionInsertDto) {
        return missionService.save(missionInsertDto);
    }

    @Override
    public MissionDto missionFindByid(int id) {
        return missionService.missionFindByid(id);
    }

    @Override
    public List<MissionDto> findAllList() {
        return missionService.findAllList();
    }

    @Override
    public String updateMission(int id, MissionDto missionDto) {
        return missionService.updateMission(id,missionDto);
    }
}
