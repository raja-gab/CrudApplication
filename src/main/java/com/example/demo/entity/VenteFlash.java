package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Vente Flash")
public class VenteFlash {
	
	@Id
	private String idVF;
	private Date dateDebVF;
	private Date dateFinVF;
	@DBRef
	private List<EtatArticleVenteFlash> etatArticleVenteFlash;
	
	

}
