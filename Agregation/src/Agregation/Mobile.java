package Agregation;

public class Mobile {
   Sim sim;
   Sim sim2;

public void setSim(Sim sim) {
	this.sim = sim;
	sim.call();
}

public void setSim2(Sim sim2) {
	this.sim2 = sim2;
	sim2.call();
   
}
}
