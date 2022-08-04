package com.ecommerce.ecommerce.user.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.user.entity.Cart;
import com.ecommerce.ecommerce.user.entity.Seller;
import com.ecommerce.ecommerce.user.entity.Wishlist;
import com.ecommerce.ecommerce.user.entity.buyer;
import com.ecommerce.ecommerce.user.repository.BuyerRepository;
import com.ecommerce.ecommerce.user.repository.CartRepository;
import com.ecommerce.ecommerce.user.repository.SellerRepository;
import com.ecommerce.ecommerce.user.repository.WishlishRepository;

@Service
public class UserService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	BuyerRepository buyerRepository;

	@Autowired
	SellerRepository sellerRepository;
	
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	WishlishRepository wishlistRepository;
	
	public List<buyer> getAllbuyer() {
		// TODO Auto-generated method stub
		return buyerRepository.findAll();
	}
	
	

	public List<Seller> getAllseller() {
		// TODO Auto-generated method stub
		return sellerRepository.findAll();
	}



	public Optional<Seller> getOneSeller(Integer sellerid) {
		// TODO Auto-generated method stub
		return  sellerRepository.findById(sellerid);
	}


	public Optional<buyer> getOneBuyer(Integer buyerid) {
		// TODO Auto-generated method stub
		return buyerRepository.findById(buyerid);
	}



	public buyer login(String email, String password) {
		// TODO Auto-generated method stub
		buyer user = buyerRepository.findByEmailAndPassword(email, password);
		   return user;
	}



	public Seller loginseller(String email, String password) {
		Seller user = sellerRepository.findByEmailAndPassword(email, password);
		   return user;
	}



	public buyer putallproducts(buyer product) {
		// TODO Auto-generated method stub
		return buyerRepository.save(product);
	}
	public Seller putallseller(Seller Seller) {
		// TODO Auto-generated method stub
		return sellerRepository.save(Seller);
	}



	public Optional<Cart> getonecart(int buyerid) {
		// TODO Auto-generated method stub
		return cartRepository.findById(buyerid);
	}
	
	public Optional<Wishlist> getonewishlist(int buyerid) {
		// TODO Auto-generated method stub
		return wishlistRepository.findById(buyerid);
	}
	
	
	

}
