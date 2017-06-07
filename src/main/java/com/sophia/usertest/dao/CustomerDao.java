package com.sophia.usertest.dao;

import java.util.List;

import com.sophia.usertest.vo.Customer;

public interface CustomerDao {
	public List<Customer> getCustomer();

	public void addCustomer();
}
