package Agregation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile mobile  =new Mobile();

		Mobile mobile2  =new Mobile();
		
		mobile.setSim(new Jio());
		mobile2.setSim(new Airtel());
//		mobile.sim.call();

	}

}
