package com.example.demo.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "EtatVenteFlash")
public class EtatArticleVenteFlash {

	@Id
	private String idEAVF; 
	@DBRef
	private Article articleAVF;
	private int qteVF;
	private double prixAVF ; 
	
}
