package com.example.demo.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "Avis")
public class Avis {
	@Id
	private String idAvis ;
	private String avis ; 
	private Date dateAvis ; 
	@DBRef
	private Client client;

}
