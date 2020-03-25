package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection  = "Fournisseur")
public class Fournisseur extends Utilisateur {
	

	private String adresseFour; 
	private Long	numTelFour; 
	

}
