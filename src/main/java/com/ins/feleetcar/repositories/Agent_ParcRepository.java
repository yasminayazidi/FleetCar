package com.ins.feleetcar.repositories;

import com.ins.feleetcar.entities.AGENT_Parc;
import com.ins.feleetcar.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Agent_ParcRepository extends JpaRepository<AGENT_Parc,Integer> {
}
