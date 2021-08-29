package in.tcampus;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.tcampus.model.Phone;
import in.tcampus.model.Student;
import in.tcampus.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			Set<Phone> phoneNumbers = new HashSet<Phone>();
			phoneNumbers.add(new Phone("house", "32354353"));
			phoneNumbers.add(new Phone("mobile", "9889343423"));

			Student student = new Student("Eswar", phoneNumbers);
			session.save(student);
			
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
