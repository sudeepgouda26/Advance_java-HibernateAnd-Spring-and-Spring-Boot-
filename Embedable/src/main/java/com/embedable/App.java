package com.embedable;

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
   
   StudentName sn1 = new StudentName();
   sn1.setfName("Rohith ");
   sn1.setLname("kumar");
   Student s1 = new Student();
   s1.setStdId(1);
   s1.setStdName(sn1);
   s1.setMarks(92);
   
   
   StudentName sn2 = new StudentName();
   sn2.setfName("Rohith ");
   sn2.setLname("Sharma");
   Student s2 = new Student();
   s2.setStdId(2);
   s2.setStdName(sn2);
   s2.setMarks(94);
   
   StudentName sn3 = new StudentName();
   sn3.setfName("virat ");
   sn3.setLname("kumar");
   Student s3 = new Student();
   s3.setStdId(3);
   s3.setStdName(sn3);
   s3.setMarks(98);
   
   
   StudentName sn4 = new StudentName();
   sn4.setfName("virat");
   sn4.setLname("kohli");
   Student s4 = new Student();
   s4.setStdId(4);
   s4.setStdName(sn4);
   s4.setMarks(92);
   em.persist(s1);
   em.persist(s2);
   em.persist(s3);
   em.persist(s4);
   
   et.commit();
   
   System.out.println("data inserted succesfully");
   
	}

}
