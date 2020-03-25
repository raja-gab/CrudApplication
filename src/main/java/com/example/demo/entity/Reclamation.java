package com.example.demo.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Reclamation")
public class Reclamation {
	
	@Id
	private String idRec;
	private String reclamation ; 
	private Date dateRec;
	@DBRef
	private Commande commandeRec;

}
