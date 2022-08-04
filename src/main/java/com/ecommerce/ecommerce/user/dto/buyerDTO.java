package com.ecommerce.ecommerce.user.dto;

import com.ecommerce.ecommerce.user.entity.buyer;

public class buyerDTO {

	int buyer_id;
	String name;
	String email;
	Long phone_no;
	String password;
	@Override
	public String toString() {
		return "buyer [buyer_id=" +buyer_id + ", name=" + name + ", email=" + email + ", phone_no=" + phone_no
				+ ", password=" + password + ", isprivileged=" + isprivileged + ", rewarpoints=" + rewarpoints
				+ ", isactive=" + isactive + "]";
	}
	public int getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(int buyerid) {
		this.buyer_id =buyerid;
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
	public Boolean getIsprivileged() {
		return isprivileged;
	}
	public void setIsprivileged(Boolean isprivileged) {
		this.isprivileged = isprivileged;
	}
	public int getRewarpoints() {
		return rewarpoints;
	}
	public void setRewarpoints(int rewarpoints) {
		this.rewarpoints = rewarpoints;
	}
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	Boolean isprivileged;
	int rewarpoints;
	Boolean isactive;
	
	
// Converts Entity into DTO
			public static buyerDTO valueOf(buyer buyer) {
				buyerDTO buyerDTO = new buyerDTO();
				buyerDTO.setBuyer_id(buyer.getBuyer_id());
				buyerDTO.setName(buyer.getName());
				buyerDTO.setPassword(buyer.getPassword());
				buyerDTO.setIsprivileged(buyer.getIsprivileged());
				buyerDTO.setIsactive(buyer.getIsactive());
				
			
				return buyerDTO;
			}
	
	
	// Converts DTO into Entity
			public buyer createEntity() {
				buyer buyer = new buyer();
				buyer.setBuyer_id(this.getBuyer_id());
				buyer.setName(this.getName());
				buyer.setPassword(this.getPassword());
				buyer.setIsprivileged(this.getIsprivileged());
				buyer.setIsactive(this.getIsactive());
				
				return buyer;
			}

}
