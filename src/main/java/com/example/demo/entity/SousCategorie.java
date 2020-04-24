package com.example.demo.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Sous Categorie")
public class SousCategorie {
	
	@Id
	private String idSousCat;
	private String libelleSousCat;
	private List <String> valeur ; 
	
	private Categorie categorie ; 
	
	
	
}
