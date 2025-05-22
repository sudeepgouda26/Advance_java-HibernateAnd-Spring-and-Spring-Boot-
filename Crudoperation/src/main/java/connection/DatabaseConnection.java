package connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		  EntityManager em = emf.createEntityManager();
		   EntityTransaction et = em.getTransaction();
		   System.out.println("Connection to database established");
		   
		   TableCreation tc  = new TableCreation();
		   tc.setMatchId(111);
		   tc.setMatchLocation("Chennai");
		   tc.setMatchPrice(2000);
		   
		   TableCreation tc1  = new TableCreation();
		   tc1.setMatchId(112);
		   tc1.setMatchLocation("Mumbai");
		   tc1.setMatchPrice(3000);
		   
		   
		   TableCreation tc2  = new TableCreation();
		   tc2.setMatchId(113);
		   tc2.setMatchLocation("Delhi");
		   	tc2.setMatchPrice(4000);
		   	
		   	
		   	TableCreation tc3  = new TableCreation();
		   	tc3.setMatchId(114);
		   	tc3.setMatchLocation("Banglore");
		   	tc3.setMatchPrice(5000);
		   	
		   	TableCreation tc4  = new TableCreation();
		   	tc4.setMatchId(115);
		   	tc4.setMatchLocation("Hyderabad");
		   	tc4.setMatchPrice(6000);
		   	
		   	TableCreation tu =em.find(TableCreation.class, 113);
		   	tu.setMatchLocation("Banglore");
		   	tu.setMatchPrice(7000);
		   	
		   	Query  q  =em.createQuery("select tq from Matchdetails tq");
		   	java.util.List<TableCreation> list = q.getResultList();
		   	
		   	for(TableCreation  tq:list) {
		   		System.out.println("Id " + tq.getMatchId() + " " + tq.getMatchLocation() + " " + tq.getMatchPrice());
		   	}
		   	
		   	et.begin();
		   	em.merge(tu);
//		   	em.persist(tc);
//		   	em.persist(tc1);
//		   	em.persist(tc2);
//		   	em.persist(tc3);
//		   	em.persist(tc4);
		   		
		   	et.commit();
		
		   	
		   	System.out.println("data  Inserted successfully");

	}

}
