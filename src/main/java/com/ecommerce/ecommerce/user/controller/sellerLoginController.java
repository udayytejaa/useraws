package com.ecommerce.ecommerce.user.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.user.entity.Seller;
import com.ecommerce.ecommerce.user.entity.buyer;
import com.ecommerce.ecommerce.user.service.UserService;

@RestController
@CrossOrigin
public class sellerLoginController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserService userService;
	
	
	
	    @PostMapping("/loginseller")
	    public String loginseller(@ModelAttribute("user") Seller user ) {
	    
	     Seller oauthUser = userService.loginseller(user.getEmail(), user.getPassword());
	    
	 
	     System.out.print(oauthUser);
	     if(Objects.nonNull(oauthUser))
	     {
	  
	     return "login successfull";
	    
	    
	     } else {
	    	
	     return "Login Successfull";
	    
	    
	     }
	 
	}
	
	    @PostMapping("/logoutseller")
	    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
	    {
	        return "Login Again";
	    }
	
}
