package com.ins.feleetcar.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Car extends CommunEntity {
    private String brand;
    private String model;
    private Integer trunkCapacity;
    private String description;
    private Integer year;
    private Integer seats;
    private String imageUrl;
}
