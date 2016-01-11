package com.rohit.dao;

import org.springframework.stereotype.Repository;

import com.rohit.model.Customer;

@Repository("customerDAO")
public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public boolean registerCustomer(Customer customer) {
		return customer.getCustomerName().equals(customer.getCustomerPassword());
	}

}
