package com.ecommerce.ecommerce.user.dto;

import com.ecommerce.ecommerce.user.entity.Seller;

public class SellerDTO {
 int seller_id;
 String name;
 String email;
 Long phone_no;
 String password;
 Boolean isactive;
@Override
public String toString() {
	return "seller [seller_id=" + seller_id + ", name=" + name + ", email=" + email + ", phone_no=" + phone_no
			+ ", password=" + password + ", isactive=" + isactive + "]";
}
public int getSellerid() {
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
//Converts Entity into DTO
			public static SellerDTO valueOf(Seller seller) {
				SellerDTO sellerDTO = new SellerDTO();
				sellerDTO.setSeller_id(seller.getSeller_id());
				sellerDTO.setName(seller.getName());
				sellerDTO.setEmail(seller.getEmail());
				sellerDTO.setPhone_no(seller.getPhone_no());
				sellerDTO.setPassword(seller.getPassword());
				sellerDTO.setIsactive(seller.getIsactive());
				
			
				return sellerDTO;
			}
	
	
	// Converts DTO into Entity
			public Seller createEntity() {
				Seller seller = new Seller();
				seller.setSeller_id(this.getSellerid());
				seller.setName(this.getName());
				seller.setEmail(this.getEmail());
				seller.setPhone_no(this.getPhone_no());
				seller.setPassword(this.getPassword());
				seller.setIsactive(this.getIsactive());
				
				return seller;
			}

}
