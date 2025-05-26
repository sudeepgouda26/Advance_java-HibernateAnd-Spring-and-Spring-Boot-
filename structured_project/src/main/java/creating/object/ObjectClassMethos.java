package creating.object;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Dto.com.Flower;

public class ObjectClassMethos {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();
	
//	public static void insertFlower(Flower flower1) {
//		et.begin();
//		em.persist(flower1);
//		et.commit();
//	}
//	public static void insertFlower2(Flower flower2) {
//		et.begin();
//		em.persist(flower2);
//		et.commit();
//		
//	}
//	public static void insertFlower3(Flower flower3) {
//		et.begin();
//		em.persist(flower3);
//		et.commit();
//		
//	}
	
	public static void UpdateFlower(String id, String flowerName, String flowerColor, int price) {
		
	   		Flower flower = em.find(Flower.class, id);
	   		flower.setFlowerName(flowerName);
	   		flower.setFlowerColor(flowerColor);
	   		flower.setPrice(price);
	   		
		et.begin();
		em.merge(flower);
		et.commit();
	}
	public static void fetchDetails(String id) {
		Flower flower =em.find(Flower.class, id);
		System.out.println("Flower Name: " + flower.getFlowerName() + "FlowerId" + flower.getId() + "Flower Color: " + flower.getFlowerColor() + "Price: " + flower.getPrice());
	}
	public static void deleteFlower(String id) {
		Flower flower = em.find(Flower.class, id);
		et.begin();
		em.remove(flower);
		et.commit();
		
	}
	
}
