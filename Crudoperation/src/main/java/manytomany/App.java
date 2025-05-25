package manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et  = em.getTransaction();
		
		et.begin();
		PanCard p = new PanCard();
		p.setPancard("ABCD1234E");
		p.setName("John Doe");
		p.setAddress("123 Main St, City, Country");
		
		em.persist(p);
		
		et.commit();
		
		

	}

}
