package com.yyf.service;

import com.yyf.po.Customer;
import com.yyf.utils.Page;

public interface CustomerService {
    public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource, String custIndustry, String custLevel);
}
