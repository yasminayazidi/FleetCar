package com.ins.feleetcar.repositories;

import com.ins.feleetcar.entities.Categorie_Amende;
import com.ins.feleetcar.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Categorie_AmendeRepository extends JpaRepository<Categorie_Amende,Integer> {
}
