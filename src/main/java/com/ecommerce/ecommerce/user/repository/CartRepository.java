package com.ecommerce.ecommerce.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.user.entity.Cart;

public interface CartRepository extends JpaRepository <Cart, Integer> {}


