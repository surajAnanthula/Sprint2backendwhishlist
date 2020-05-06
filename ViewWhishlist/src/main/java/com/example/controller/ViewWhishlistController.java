package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.service.ViewWhishlistService;



@RestController
@RequestMapping("/viewproductlist")
@CrossOrigin(origins = "http://localhost:4200")
public class  ViewWhishlistController {

	@Autowired
	private ViewWhishlistService serviceobj;

	@GetMapping("/view")
	public List<Product> viewProduct()
	{
		return serviceobj.viewProduct();
	}
	
	
	
	
}
