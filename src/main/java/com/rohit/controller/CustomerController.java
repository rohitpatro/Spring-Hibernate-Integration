package com.rohit.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rohit.service.CustomerService;

@Controller
@RequestMapping("/")
public class CustomerController {
	private static Logger logger = Logger.getLogger(CustomerController.class);

	@Autowired
	CustomerService customerService;

	@RequestMapping("home")
	public String homePageRequest() {
		logger.info("CustomerController :: homePageRequest() method invokede");
		return "home";
	}

}
