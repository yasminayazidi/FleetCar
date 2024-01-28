package com.ins.feleetcar.repositories;

import com.ins.feleetcar.entities.RESPONSABLE_PARC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Responsable_ParcRepository extends JpaRepository<RESPONSABLE_PARC,Integer> {
}
