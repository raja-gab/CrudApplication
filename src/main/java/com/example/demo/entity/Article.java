package com.example.demo.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection  = "Article")
public class Article {
	@Id 
	private String idArt;
	private String designtationArt;
	private String descriptionArt;
	private  double prixArt;
	private int qteStockArt;
	private double tauxRemiseArt;
					
	@DBRef
	private Marque marqueArt;
	@DBRef
	private SousCategorie sousCategorieArt;
	@DBRef
	private Fournisseur fournisseurArt;
	@DBRef
	private Avis avisArt ; 
	@DBRef
	private ImageModel imageModel ;
	
}
