package com.ins.feleetcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ins.feleetcar.entities.Car;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car,Integer> {
}
