package com.schoolofnet.crud_r;

// import java.util.List;

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
    		
    		Product product = new Product();
    		
    		product.setName("P 1");
    		product.setPrice(10.00);
    		
    		// session.save(product); 
    		
    		// Deprecated    		
    		// List<Product> products = session.createCriteria(Product.class).list();

    		// Deprecated     		
    		// List<Product> products = session.createQuery("from Product").list();
    		
    		// Listando todos os itens (Descomentar para teste. Lembrar de descomentar o import do java.util.List, no topo do arquivo)
    		// List<Product> products = session.createQuery("from Product").getResultList();
    		
    		// Listando um item específico através da primary key
    		Product p1 = session.find(Product.class, 3);
    		
    		System.out.println(p1.getName());
    		
    		session.getTransaction().commit();
    }
}