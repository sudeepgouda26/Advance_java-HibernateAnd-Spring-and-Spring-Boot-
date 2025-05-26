package Dao;

import Dto.com.Flower;
import creating.object.ObjectClassMethos;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Flower flowr1 = new Flower();
//		flowr1.setFlowerName("Rose");
//		flowr1.setFlowerColor("Red");
//		flowr1.setPrice(10);
//		flowr1.setId("1ac34ad");
//		
//		
//		Flower flowr2 = new Flower();
//		flowr2.setFlowerName("Lilly");
//		flowr2.setFlowerColor("White");
//		flowr2.setPrice(20);
//		flowr2.setId("1ac35ad");
//		
//		Flower flowr3 = new Flower();
//		flowr3.setFlowerName("Tulip");
//		flowr3.setFlowerColor("Yellow");
//		flowr3.setPrice(30);
//		flowr3.setId("1ac36ad");
//		
//		ObjectClassMethos.insertFlower(flowr1);
//		ObjectClassMethos.insertFlower2(flowr2);
//		ObjectClassMethos.insertFlower3(flowr3);
//		

	ObjectClassMethos.UpdateFlower("1ac34ad", "Rose", "Red", 15);
		
		
		//em.close();
		//emf.close();
	}

}
