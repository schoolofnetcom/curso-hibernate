package com.schoolofnet.crud_d;

import org.hibernate.Session;

import com.schoolofnet.model.HibernateSession;
import com.schoolofnet.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		Session session = HibernateSession.getSessionFactory().openSession();
    		
    		session.beginTransaction();
    		
    		Product product = session.find(Product.class, 3);
    		
    		if(product != null) {   			
    			session.remove(product);
    			// session.delete(product);
    		}
    		
    		// Product product = new Product();
    		
    		// product.setName("P 1");
    		// product.setPrice(10.00);
    		
    		// session.save(product); 
    		
    		session.getTransaction().commit();
    }
}