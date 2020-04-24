package com.example.demo.entity;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Facture")
public class Facture {
	
	@Id
	private String idFcat; 
	private Date dateFact; 
	private double tva;
	private double remiseFact; 
	private double totalTva; 
	private double totalTtc; 
	
	private Commande commandeLiv;
	
	

}
