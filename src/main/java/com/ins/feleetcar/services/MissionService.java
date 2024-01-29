package com.ins.feleetcar.services;

import com.ins.feleetcar.entities.dtos.MissionDto;
import com.ins.feleetcar.entities.dtos.MissionInsertDto;

import java.util.List;

public interface MissionService {
    String save(MissionInsertDto missionInsertDto);
    MissionDto missionFindByid(int id);
    List<MissionDto> findAllList ();
    String updateMission(int id, MissionDto missionDto);
}
