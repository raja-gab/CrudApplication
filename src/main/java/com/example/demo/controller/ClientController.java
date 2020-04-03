
package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Article;

import com.example.demo.service.ClientService;

@RestController
public class ClientController {

	@Autowired
	private ClientService service;
	
	@GetMapping("/article")
	public ResponseEntity<List<Article>> getAllProducts(){
		return service.findAllArticle();
	}
	
	@GetMapping("/article/{id}")
	public Optional<Article> getProductById(@PathVariable("id") String id ){
		return service.getProductById(id);
	}
	
}
