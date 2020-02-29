package com.yyf.service;

import com.yyf.po.Customer;
import com.yyf.utils.Page;

public interface CustomerService {
    public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource, String custIndustry, String custLevel);

    public int createCustomer(Customer customer);

    public Customer getCustomerById(Integer id);

    public int updateCustomer(Customer customer);

    public int deleteCustomer(Integer id);
}
