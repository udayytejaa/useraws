package com.ecommerce.ecommerce.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "buyer")
public class buyer {


	
	public int getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(int buyerid) {
		this.buyer_id = buyerid;
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
	public int getRewardpoints() {
		return rewardpoints;
	}
	public void setRewardpoints(int rewarpoints) {
		this.rewardpoints = rewardpoints;
	}
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	@Id
	@GeneratedValue
	int buyer_id;
	@Column(nullable = false)
	String name;
	@Column(nullable = false)
	String email;
	@Column(nullable = false)
	Long phone_no;
	@Column(nullable = false)
	String password;
	@Column(nullable = false)
	Boolean isprivileged;
	@Column(nullable = false)
	int rewardpoints;
	@Column(nullable = false)
	Boolean isactive;

}
