package com.schoolofnet.relacionamento_one_to_one;

import org.hibernate.Session;

import com.schoolofnet.model.Address;
import com.schoolofnet.model.HibernateSession;
import com.schoolofnet.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		Session session = HibernateSession.getSessionFactory().openSession();
    		
    		User user = new User();
    		Address address = new Address();
    		
    		address.setNumber(900);
    		address.setStreet("Down town");
    		
    		user.setUsername("Leonanluppi");
    		user.setName("Leonan");
    		user.setLastname("Luppi");
    		
    		address.setUser(user);
    		user.setAddress(address);
    		
        System.out.println( "Hello World!" );
        System.out.println( session );
        System.out.println(user.getName() + " " + user.getLastname());
        System.out.println(user.getAddress().getStreet());
    }
}