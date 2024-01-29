package com.ins.feleetcar.repositories;

import com.ins.feleetcar.entities.Driver;
import com.ins.feleetcar.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EntrepriseRepository extends JpaRepository<Entreprise,Integer> {
}
