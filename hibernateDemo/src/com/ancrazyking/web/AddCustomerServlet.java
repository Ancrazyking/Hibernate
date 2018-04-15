package com.ancrazyking.web;

import com.ancrazyking.bean.Customer;
import com.ancrazyking.service.CustomerService;
import com.ancrazyking.service.impl.CustomerServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class AddCustomerServlet extends HttpServlet
{

    private static final long serialVersionUID=1L;

    private CustomerService customerService=new CustomerServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //获得参数并封装到Customer对象
        Customer c=new Customer();
        try{
            BeanUtils.populate(c,req.getParameterMap());
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }
        customerService.save(c);
        resp.sendRedirect(req.getContextPath()+"/ListCustomServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
       doGet(req,resp);
    }
}
