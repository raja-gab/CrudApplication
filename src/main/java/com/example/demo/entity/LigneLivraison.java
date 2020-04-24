package com.example.demo.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "LigneLivraison ")
public class LigneLivraison {
	
	@Id
	private String idEL ;
	private Date dateLiv;
	
	private Livraison livraison;

}
