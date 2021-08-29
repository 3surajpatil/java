package in.tcampus.hibernate_annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import in.tcampus.hibernate_annotation.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	Metadata metadata=new MetadataSources(ssr).getMetadataBuilder().build();
       
        SessionFactory sf=metadata.buildSessionFactory();
        Session ses=sf.openSession();
        
        User user=new User("test@ramdommail.com","test_lastname","9876789765");
        
        Transaction tx=ses.beginTransaction();
       int id= (Integer) ses.save(user);
        ses.flush();
        tx.commit();
        System.out.println("object stored successfully. :- "+id);
        
    }
}
