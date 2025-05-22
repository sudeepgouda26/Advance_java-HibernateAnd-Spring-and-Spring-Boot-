package crudopreration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import antlr.collections.List;

public class ConnectionClass {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		System.out.println("Connection Established" );
		System.out.println("table created succesfully");
		TableCreation tb = new TableCreation();
		
		//type1
//		TableCreation tu = new TableCreation(); // we cant use both em.merge and em.persist in case of object creation
//		tu.setId(1);
//		tu.setName("Rohith");
//		tu.setPhoneno(7654567890L);
		
		//type2\
//		TableCreation tu  =em.find(TableCreation.class, 2); // here we can use em.merge() or em.persist() both are same in case find method we cant use em.merge () and em.persist in for update using object creation
//		tu.setName("Rohith Kumar");
//		tu.setPhoneno(76545674590L); 
		
		//forfetching  
		
//		TableCreation tb1  = em.find(TableCreation.class, 1 );
//		System.out.println(tb1.getId() + " " + tb1.getName() + " " + tb1.getPhoneno());
		
//		   Query q = em.createQuery("select tb1 from TableCreation tb1");
//		java.util.List<TableCreation> list = q.getResultList();
//		for(TableCreation tb1:list) {
//			System.out.print("id:" + tb1.getId() + " " + tb1.getName() + " " + tb1.getPhoneno());
//			
//		}
//		
	//	Delete row by row
		//TableCreation tb2 = em.find(TableCreation.class, 2);
		
//		delete all the values at time
		Query q2 = em.createQuery("delete from TableCreation");
		
		
//		TableCreation tb1 = new TableCreation();
//		tb1.setId(2);
//		tb1.setName("kumar");
//		tb1.setPhoneno(1289567890L);
//		
//
//		TableCreation tb2 = new TableCreation();
//		tb2.setId(3);
//		tb2.setName("shahshank");
//		tb2.setPhoneno(1289567823L);
		
		
		et.begin();
//		em.remove(tb2);
		q2.executeUpdate();
//		em.merge(tu);
//		em.persist(tu); // here i can use em.merge() or em.persist() both are same in case find method we cant use em.merge () and em.persist in for update using object creation
//		Insert
//		em.persist(tb);
//		em.persist(tb1);
//		em.persist(tb2);
		et.commit();
		System.out.println("Data deleted successfully");
	
	}
}

