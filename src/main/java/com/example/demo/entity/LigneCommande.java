package com.example.demo.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "LigneCommande ")
public class LigneCommande {
	
	@Id
	private String idLC;
	private int qteArtLC ;
	
	private Article article ;

}
