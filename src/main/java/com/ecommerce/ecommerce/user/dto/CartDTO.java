package com.ecommerce.ecommerce.user.dto;


import com.ecommerce.ecommerce.user.entity.Cart;

public class CartDTO {
int buyer_id;
int prod_id;
int quantity;
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
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "cart [buyer_id=" + buyer_id + ", prod_id=" + prod_id + ", quantity=" + quantity + "]";
}

//Converts Entity into DTO
			public static CartDTO valueOf(Cart cart) {
				CartDTO cartDTO = new CartDTO();
				cartDTO.setProd_id(cart.getProd_id());
				cartDTO.setBuyer_id(cart.getBuyer_id());
				cartDTO.setQuantity(cart.getQuantity());
				
			
				return cartDTO;
			}
	
	
	// Converts DTO into Entity
			public Cart createEntity() {
				Cart cart = new Cart();
				cart.setProd_id(this.getProd_id());
				cart.setBuyer_id(this.getBuyer_id());
				cart.setQuantity(this.getQuantity());
				
				return cart;
			}


}
