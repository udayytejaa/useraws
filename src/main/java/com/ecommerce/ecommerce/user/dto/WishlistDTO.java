package com.ecommerce.ecommerce.user.dto;

import com.ecommerce.ecommerce.user.entity.Cart;
import com.ecommerce.ecommerce.user.entity.Wishlist;

public class WishlistDTO {
	
int buyer_id;
int prod_id;
@Override
public String toString() {
	return "wishlist [buyer_id=" + buyer_id + ", prod_id=" + prod_id + "]";
}
public int getBuyer_id() {
	return buyer_id;
}
public void setBuyer_id(int buyerid) {
	this.buyer_id = buyerid;
}
public int getProd_id() {
	return prod_id;
}
public void setProd_id(int prodid) {
	this.prod_id = prodid;
}
//Converts Entity into DTO
public static WishlistDTO valueOf(Wishlist wishlist) {
	WishlistDTO wishlistDTO = new WishlistDTO();
	wishlistDTO.setProd_id(wishlist.getProd_id());
	wishlistDTO.setBuyer_id(wishlist.getBuyer_id());
	
	

	return wishlistDTO;
}


// Converts DTO into Entity
public Wishlist createEntity() {
	Wishlist wishlist = new Wishlist();
	wishlist.setProdid(this.getProd_id());
	wishlist.setBuyer_id(this.getBuyer_id());
	
	return wishlist;
}
}
