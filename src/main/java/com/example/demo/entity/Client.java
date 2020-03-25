package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection  = "Client")
public class Client extends Utilisateur {
	

	private Long cinCli; 
	private String adresseCli;
	private Long numTelCli;

}
