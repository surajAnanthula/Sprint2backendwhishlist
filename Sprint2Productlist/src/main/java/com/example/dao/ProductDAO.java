package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product,Integer>{
	@Query("select d from Product d")
	List<Object[]> findall();

}
