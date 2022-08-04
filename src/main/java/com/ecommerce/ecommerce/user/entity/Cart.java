package com.ecommerce.ecommerce.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
	int buyer_id;
	@Column(nullable = false)
	int prod_id;
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
	@Column(nullable = false)
	int quantity;
}
