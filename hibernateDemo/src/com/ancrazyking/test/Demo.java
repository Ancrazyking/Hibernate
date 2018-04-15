package com.ancrazyking.test;

import com.ancrazyking.bean.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class Demo
{
    @Test
    public void saveCustomer(){
        Configuration conf=new Configuration().configure();
        SessionFactory sessionFactory=conf.buildSessionFactory();

        Session session=sessionFactory.openSession();


        Transaction tx=session.beginTransaction();

        Customer c=new Customer();
        c.setCust_industry("Google公司");
        c.setCust_phone("17826618586");
        c.setCust_level("Java开发工程师");
        c.setCust_name("王阿峰");
        session.save(c);

        tx.commit();
        session.close();
        sessionFactory.close();




    }


}
