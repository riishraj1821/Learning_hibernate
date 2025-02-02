package setting_up;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import setting_up.entites.User;

public class App {

	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
		
		Session session  = factory.getCurrentSession();
				
		
//		try {
//			session.beginTransaction();
//			session.createQuery("update users set password = 'pass'" +  " where username='pooja'").executeUpdate();
//
//		}
//		
//		try {
//			session.beginTransaction();
//			session.createQuery("update users set password = 'super_password' "
//								+ " where password like '%123%'").executeUpdate();
//			}	
		
		try {
		session.beginTransaction();
		List<User> users = session.createQuery("update users set password = 'pass'" +  " where username='pooja'").executeUpdate();

	}
		
		finally {
		session.close();
		factory.close();
	}

}
	}
