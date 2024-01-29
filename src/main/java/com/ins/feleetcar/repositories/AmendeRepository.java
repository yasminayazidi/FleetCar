package com.ins.feleetcar.repositories;

import com.ins.feleetcar.entities.AMENDE;
import com.ins.feleetcar.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AmendeRepository extends JpaRepository<AMENDE,Integer> {
}
