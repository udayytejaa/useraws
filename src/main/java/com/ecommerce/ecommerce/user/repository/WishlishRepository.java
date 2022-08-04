package com.ecommerce.ecommerce.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.user.entity.Wishlist;

public interface WishlishRepository extends JpaRepository<Wishlist, Integer> {

}
