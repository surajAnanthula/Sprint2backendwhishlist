package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProductDAO;
import com.example.entity.Product;

@Service
public class ProductlistServiceimpl implements ProductsListService{
	@Autowired 
	private ProductDAO productdao;
	@Override
	public List<Product> viewProduct() {
		List<Product>  productsList=productdao.findAll(); 
		return productsList;
	}
}
