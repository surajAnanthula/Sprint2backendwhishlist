package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Product;

public interface ViewWhishlistDao extends JpaRepository<Product,Integer>{

	@Query("select d from Product d where d.userId=?1")
	

	List<Product> fetch(Integer userId);

}
