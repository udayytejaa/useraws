package com.ecommerce.ecommerce.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seller")
public class Seller {

	@Id
	 int seller_id;
	@Column(nullable = false)
	 String name;
	@Column(nullable = false)
	 String email;
	@Column(nullable = false)
	 Long phone_no;
	@Column(nullable = false)
	 String password;
	@Column(nullable = false)
	 Boolean isactive;
	 
	 
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int sellerid) {
		this.seller_id = sellerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long phonenumber) {
		this.phone_no = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
}
