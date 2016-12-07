package com.customer.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.customer.domain.Customer;
import com.customer.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	private static final Logger logger = Logger.getLogger(CustomerController.class);

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody Customer customer) {
		logger.info("save operation is started for Customer " + customer.getFirstName() + " " + customer.getLastName());
		return new ResponseEntity<String>("Saved Customer details", HttpStatus.OK);
	}
	
}
