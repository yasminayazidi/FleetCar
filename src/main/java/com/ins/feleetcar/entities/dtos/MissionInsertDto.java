package com.ins.feleetcar.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissionInsertDto {
    private int id;
    private int driverID;
    private int carID;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isApproved;
    private boolean isFinished;
    private int entrepriseId;
}
