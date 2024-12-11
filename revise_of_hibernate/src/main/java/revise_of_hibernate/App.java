package revise_of_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import revise_of_hibernate.entity.Users;

public class App {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();{
		
		//for create
//		try {
//			//create object for entity class
//			Users users = new Users("username", "password", "firstname", "lastname");
//			
//			//begin transaction
//			session.beginTransaction();
//			
//			//perform operation
//			session.persist(users);
//			
//			//commit the changes
//			session.getTransaction().commit();
//			
//		}
		
		//for ready
//		try {
//			Users users = new Users();
//			session.beginTransaction();
//			users = session.get(Users.class, 0);
//			session.getTransaction().commit();
//		}
		
//			for update
//		try {
//			Users users = new Users();
//			session.beginTransaction();
//			users = session.get(Users.class, 0);
//			users.setPassword("null");
//			session.getTransaction().commit();
//			System.out.println(users);
//		}
			
//			for delete
		try{
			Users users = new Users();
			session.beginTransaction();
			users = session.get(Users.class, 0);
			session.delete(users);
			session.getTransaction().commit();
		}finally {
			session.close();
			factory.close();
		}

	}
	
}
}
