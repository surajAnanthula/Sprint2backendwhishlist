package com.example.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.entity.Product;

@Repository
public class AddtoWhishlistDao implements AddtoWhishlistDaointerface{
	@PersistenceContext	
	 EntityManager em;
	@Override
	public Product AddtoWhishlist(Product product) {
		
		Product p=em.merge(product);
		return p;
	}

}
