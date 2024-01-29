package com.ins.feleetcar.repositories;

import com.ins.feleetcar.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface DriverRepository extends JpaRepository<Driver,Integer> {
}
