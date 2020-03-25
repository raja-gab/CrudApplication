package com.example.demo.entity;

import java.sql.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection  = "Commande")
public class Commande {
	
	@Id
	private String idCmd; 
	private Date dateCmd; 
	private double totalCmd; 
	private String modePaiement;
	@DBRef
	private LigneCommande ligneCmd ; 
	@DBRef
	private Client clientCmd;
	@DBRef
	private LigneLivraison ligneLivraisonCmd;

}
