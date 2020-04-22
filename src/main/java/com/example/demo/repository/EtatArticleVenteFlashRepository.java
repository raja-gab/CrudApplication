package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.EtatArticleVenteFlash;


@RepositoryRestResource
public interface EtatArticleVenteFlashRepository extends MongoRepository<EtatArticleVenteFlash, String>{

}
