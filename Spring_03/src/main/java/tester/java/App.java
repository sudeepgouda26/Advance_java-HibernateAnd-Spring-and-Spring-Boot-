package tester.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container  = new AnnotationConfigApplicationContext(Configure.class);
		
		container.getBean(Apple.class).eat();

	}

}
