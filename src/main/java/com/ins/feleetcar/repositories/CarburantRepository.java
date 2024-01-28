package com.ins.feleetcar.repositories;

import com.ins.feleetcar.entities.Carburant;
import com.ins.feleetcar.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarburantRepository extends JpaRepository<Carburant,Integer> {
}
