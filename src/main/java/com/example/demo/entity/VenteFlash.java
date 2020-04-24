package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Vente Flash")
public class VenteFlash {
	
	@Id
	private String idVF;
	private LocalDateTime dateDebVF;
	private LocalDateTime dateFinVF;
	
	private List<ArticleVenteFlash> articleVenteFlash;
	
	

}
