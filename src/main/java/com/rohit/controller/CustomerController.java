package com.rohit.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rohit.model.Customer;
import com.rohit.service.CustomerService;
import com.rohit.util.CustomerConstants;

@Controller
@RequestMapping("/")
public class CustomerController {
	private static Logger logger = Logger.getLogger(CustomerController.class);

	@Autowired
	CustomerService customerService;

	@RequestMapping("home")
	public String homePageRequest() {
		logger.info("CustomerController :: homePageRequest() method invokede");
		return CustomerConstants.CUSTOMER_HOME;
	}

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String getRegisterForm(Customer customer) {
		logger.info("CustomerController :: getRegisterForm() method invoked");
		/*
		 * return new ModelAndView("customer/registerUser", "customer", new
		 * Customer()); and remove the Customer customer from the argument of
		 * the method to work as same
		 */
		return CustomerConstants.CUSTOMER_REGISTER;
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("customer") Customer customer) {
		if (customerService.registerCustomer(customer))
			return new ModelAndView(CustomerConstants.CUSTOMER_HOME, "message", "Successfully Registered");
		else
			return new ModelAndView(CustomerConstants.CUSTOMER_REGISTER, "message", "Something Went Wrong");
	}

}
