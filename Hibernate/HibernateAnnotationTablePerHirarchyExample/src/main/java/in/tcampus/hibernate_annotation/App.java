package in.tcampus.hibernate_annotation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import in.tcampus.hibernate_annotation.model.GmailUser;
import in.tcampus.hibernate_annotation.model.RediffmailUser;
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
        
        
        
        Transaction tx=ses.beginTransaction();
     
      //onlyUser
        User user=new User("onlyUserName","onlyUserLastname","9876543456");
        
     //gmailuser
     GmailUser gmailUser=new GmailUser();    
     gmailUser.setFirstName("gmailUserFirstname");
     gmailUser.setLastName("gmailUserLastName");
     gmailUser.setMobile("9876789087");
     gmailUser.setInboxSize(50);
     gmailUser.setSentMailSize(50);
     gmailUser.setAllMailSize(100);
     
     //rediffmailuser
     
     RediffmailUser rediffmailUser=new RediffmailUser();
     rediffmailUser.setFirstName("rediffmailUser_firstname");
     rediffmailUser.setLastName("rediffmailUser_lastNmae");
     rediffmailUser.setMobile("8754567654");
     SimpleDateFormat sdf=new SimpleDateFormat("DD/MM/YYYY");
    
     try {
		rediffmailUser.setAccountOpeningDate(sdf.parse("10/23/2018"));
	} catch (ParseException e) {		
		e.printStackTrace();
	}           
      
      ses.persist(gmailUser);
      ses.persist(user);
      ses.persist(rediffmailUser);  
       
        ses.flush();
        tx.commit();
     //System.out.println("object stored successfully. :- "+id);
        
    }
}
