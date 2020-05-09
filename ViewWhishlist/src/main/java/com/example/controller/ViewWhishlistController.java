package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.exceptions.IdNotFoundException;
import com.example.service.ViewWhishlistService;



@RestController
@RequestMapping("/viewproductlist")
@CrossOrigin(origins = "http://localhost:4200")
public class  ViewWhishlistController {

	@Autowired
	private ViewWhishlistService serviceobj;

	@GetMapping("/view/{userId}")
	public List<Product> viewProduct(@PathVariable("userId") int userId)
	{
		List<Product> p=serviceobj.viewProduct(userId);
		if(p == null)
		{
			throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
		}
		else {
		return p;
	}
	}
}