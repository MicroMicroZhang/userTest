package com.sophia.usertest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophia.usertest.dao.CustomerDao;
import com.sophia.usertest.service.CustomerService;
import com.sophia.usertest.vo.Customer;
@Service
public class CustomerServiceImp implements CustomerService{
	@Autowired
	CustomerDao customerDao;
	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		List<Customer>  customer = new ArrayList<Customer>();
		customer = customerDao.getCustomer();
		return customer;
	}
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.addCustomer();
		return;
	}	
	
}
