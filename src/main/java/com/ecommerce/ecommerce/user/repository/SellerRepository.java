package com.ecommerce.ecommerce.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.user.entity.Seller;

public interface SellerRepository extends JpaRepository <Seller, Integer>{

	Seller findByEmailAndPassword(String email, String password);

	

}
