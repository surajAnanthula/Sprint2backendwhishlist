package com.capgemini;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.Product;
import com.example.exceptions.IdNotFoundException;
import com.example.service.ViewWhishlistService;
import com.example.service.ViewWhishlistServiceImpl;

public class ViewWhishlistTest {
	int userId=123;
	Object[] whishlist=new Object[3];
	@Autowired
	private ViewWhishlistService whishlistservice;
	@Before
	public void initInputs() {
		/*
		 * whishlist[0]=new Product(1485,"nokia","electronics",123); whishlist[1]=new
		 * Product( 1456,"samsung","mobiles",123); whishlist[2]=new Product(
		 * 1542,"honor","electronics",123);
		 */
	}

	@Test
	public void test()  throws IdNotFoundException{
		List<Product> testOutput=whishlistservice.viewProduct(userId);
		assertEquals(3,testOutput.size());
		
	}

}
