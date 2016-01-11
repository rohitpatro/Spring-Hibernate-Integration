package com.rohit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CustomerController {

	public String homePageRequest() {
		return "index";
	}

}
