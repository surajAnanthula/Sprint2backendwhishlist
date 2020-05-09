package com.capgemini;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.Product;
import com.example.service.ProductsListService;

public class ProductlistTest {
	String str1="displayed all products";
	String str2=null;
	@Autowired
	private ProductsListService services;

	@Test
	public void test() {
		List<Product> productlist=services.viewProduct();
		if(productlist!=null)
		{
		str2="displayed all products";
		}
		assertEquals(str1,str2);
	}

}
