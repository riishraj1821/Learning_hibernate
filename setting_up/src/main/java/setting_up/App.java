package setting_up;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import setting_up.entites.User;

public class App {

	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		//for Create
//          try {
//					//create object of entity class type
//					User user = new User("username", "password", "firstname", "lastname");
//					//start transaction
//					session.beginTransaction();
//					//perform operation
//					session.persist(user);
//					//commit the transaction
//					session.getTransaction().commit();
//	}
		
	// for read 
//		try {
//			
//			//create object of entity class type
//			User user = new User();
//			//start transaction
//			session.beginTransaction();
//			//perform operation
//			user = session.get(User.class,2);
//			//commit the transaction
//			session.getTransaction().commit();
//			System.out.println(user);
//		}
		
	//for upadate onlu one line changes
//		try {
//			
//			//create object of entity class type
//			User user = new User();
//			//start transaction
//			session.beginTransaction();
//			//perform operation
//			user = session.get(User.class,2);
//			user.setPassword("password");
//			//commit the transaction
//			session.getTransaction().commit();
//			System.out.println(user);
//		}
		
		
		
		
		try {
			
			//create object of entity class type
			User user = new User();
			//start transaction
			session.beginTransaction();
			//perform operation
			user = session.get(User.class,0);
			session.delete(user);
			//commit the transaction
			session.getTransaction().commit();
		}
		
		
		
				
				finally {
		session.close();
		factory.close();
	}

}
	}
