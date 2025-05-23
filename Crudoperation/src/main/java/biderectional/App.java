package biderectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction et = em.getTransaction();
		 
		 et.begin();
		 Pancard p1 = new Pancard();
		 Person p = new Person();
		 p.setId(1);;
		 p.setName("rohith");;
		 p.setAddress("bengaluru");;
		 p.setP(p1);
		 
		
		 p1.setName("rohith");
		p1.setPancardNo("12hsajy5");
		p1.setAddress("bengaluru");
		p1.setP(p);
		
		em.persist(p1);
		em.persist(p);
		et.commit();

	}

}
