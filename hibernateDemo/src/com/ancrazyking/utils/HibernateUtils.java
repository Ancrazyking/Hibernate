package com.ancrazyking.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtils
{
    private static SessionFactory sf;

    static{
        //创建
        Configuration conf=new Configuration().configure();
        //根据配置信息,创建SessionFactory对象
        sf=conf.buildSessionFactory();
    }

    //获得session
    public static Session openSession(){
        Session session=sf.openSession();
        return  session;
    }

    //获得session后与线程绑定的session
    public static Session getCurrentSession(){
        Session session=sf.getCurrentSession();
        return session;
    }

    public static  void main(String [] args){
        System.out.println(HibernateUtils.openSession());
    }



}
