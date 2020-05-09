package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.service.AddtoWhishlistService;

@RestController
@RequestMapping("/Whishlist")
@CrossOrigin("http://localhost:4200")
public class AddtoWhishlistController {
	@Autowired
	AddtoWhishlistService serviceobj;

	// Create Employee
	@PostMapping("/Add")
	public Object AddtoWhishlist(@RequestBody Product product) {
		return serviceobj.Addtowhishlist(product);
				
}}
