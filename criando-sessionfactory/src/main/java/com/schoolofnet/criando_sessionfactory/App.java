package com.schoolofnet.criando_sessionfactory;

import org.hibernate.Session;

import com.schoolofnet.model.HibernateSession;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		Session session = HibernateSession.getSessionFactory().openSession();
        System.out.println( "Hello World!" );
        System.out.println( session );
    }
}
