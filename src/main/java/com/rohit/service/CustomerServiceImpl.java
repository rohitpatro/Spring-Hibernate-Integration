package com.rohit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rohit.dao.CustomerDAO;
import com.rohit.model.Customer;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public boolean registerCustomer(Customer customer) {
		return customerDAO.registerCustomer(customer);
	}

}
