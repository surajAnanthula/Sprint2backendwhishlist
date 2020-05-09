package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.ViewWhishlistDao;
import com.example.entity.Product;



@Service
public class ViewWhishlistServiceImpl implements ViewWhishlistService {
	@Autowired 
	private ViewWhishlistDao dao;

	@Override
	public List<Product> viewProduct(Integer userId) {
		List<Product>  productsList=dao.fetch(userId); 
		return productsList;
	}
	}
	