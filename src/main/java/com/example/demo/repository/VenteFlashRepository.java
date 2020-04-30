package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.VenteFlash;

@RepositoryRestResource( path = "venteflash")
public interface VenteFlashRepository extends MongoRepository<VenteFlash, String>{

}
