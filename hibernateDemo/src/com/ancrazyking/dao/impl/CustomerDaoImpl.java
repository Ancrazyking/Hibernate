package com.ancrazyking.dao.impl;

import com.ancrazyking.bean.Customer;
import com.ancrazyking.dao.CustomerDao;
import com.ancrazyking.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDaoImpl implements CustomerDao
{
    @Override
    public void save(Customer c)
    {
        Session session= HibernateUtils.openSession();
        //打开事务
        Transaction tx=session.beginTransaction();
        //执行保存
        session.save(c);
        //提交事务
        tx.commit();
        //关闭资源
        session.close();
    }
}
