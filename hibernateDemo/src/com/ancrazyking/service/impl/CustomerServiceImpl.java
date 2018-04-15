package com.ancrazyking.service.impl;

import com.ancrazyking.bean.Customer;
import com.ancrazyking.dao.CustomerDao;
import com.ancrazyking.dao.impl.CustomerDaoImpl;
import com.ancrazyking.service.CustomerService;

public class CustomerServiceImpl implements CustomerService
{
    private CustomerDao customerDao=new CustomerDaoImpl();
    @Override
    public void save(Customer c)
    {
        customerDao.save(c);

    }
}
