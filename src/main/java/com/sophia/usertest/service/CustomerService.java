package com.sophia.usertest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sophia.usertest.vo.Customer;
@Service
public interface CustomerService {
	public List<Customer> getCustomer();
	public void addCustomer(Customer customer);
}
