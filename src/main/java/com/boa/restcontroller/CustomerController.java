package com.boa.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boa.model.Customer;

@RestController
public class CustomerController {
	
	@RequestMapping(method = RequestMethod.GET,value = "/getdetails")
	public Customer featchDetail() {
		Customer c =new Customer();
		c.setId(1);
		c.setName("pradeep");
		c.setAddress("asa");
		return c;
		
	}

}
