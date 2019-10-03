package com.CezaryZal.comment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DateTest {
    public static void main(String[] args) {

        //create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Comment.class)
                .buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();




    }
}
