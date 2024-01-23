package com.ins.feleetcar.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CarDto {
    private int id;
    private String brand;
    private String model;
    private Integer trunkCapacity;
    private String description;
    private Integer year;
    private Integer seats;
    private String imageUrl;
    private int entrepriseId;
}
