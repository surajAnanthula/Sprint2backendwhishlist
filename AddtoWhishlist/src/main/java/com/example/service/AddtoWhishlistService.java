package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AddtoWhishlistDao;
import com.example.entity.Product;


@Service
@Transactional
public class AddtoWhishlistService {

@Autowired
AddtoWhishlistDao dao;


public Product Addtowhishlist(Product product) {
	return dao.AddtoWhishlist(product);
}

}
