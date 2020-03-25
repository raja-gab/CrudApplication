package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collation = "Categorie")
public class Categorie {
	@Id
	private String idCat;
	private String libelleCat;

}
