package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Marque")
public class Marque {
	@Id
	private String idMarq;
	private String libelleMarq;
}
