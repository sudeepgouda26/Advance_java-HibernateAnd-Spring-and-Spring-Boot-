package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	
 public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	et.begin();
	BankAccounts b = new BankAccounts();
	BankAccounts b1 = new BankAccounts();
	BankAccounts b2 = new BankAccounts();
	 PanCard p1 = new PanCard();
	 p1.setPancardId("ABCD1234E");
	 p1.setName("John Doe");
	 p1.setAddress("bengaluru");
	
	 
	 b.setBankName("State Bank of India");
	 b.setIfscCode("SBI0001234");
	 b.setAddress("Bengaluru");
	 b.setP(p1);
	 b1.setBankName("HDFC Bank");
	 b1.setIfscCode("HDFC0005678");
	 b1.setAddress("Bengaluru");
	 b1.setP(p1);
	 
	 b2.setBankName("ICICI Bank");
	 b2.setIfscCode("ICICI0009101");
	 b2.setAddress("Bengaluru");
	 b2.setP(p1);
	 
	 List<BankAccounts> bankAccounts = new ArrayList<BankAccounts>();
	 bankAccounts.add(b);
	 bankAccounts.add(b1);
	 bankAccounts.add(b2);
	 p1.setBankAccounts(bankAccounts);
	 
	 
	
	 em.persist(p1);
	 em.persist(b);
	 em.persist(b1);
	 em.persist(b2);
	
	et.commit();
}

}
