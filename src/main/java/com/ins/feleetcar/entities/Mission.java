package com.ins.feleetcar.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Mission extends CommunEntity{
    @ManyToOne
    private Car car;
    @ManyToOne
    private Driver driver;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isApproved;
    private boolean isFinished;

}
