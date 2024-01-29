package com.ins.feleetcar.repositories;

import com.ins.feleetcar.entities.Driver;
import com.ins.feleetcar.entities.Parc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ParcRepository extends JpaRepository<Parc,Integer> {
}
