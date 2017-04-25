package kiet.project.cms;

import java.util.ArrayList;


public class Service {
	
	public void scenario(CarServant servant)
	{
		IVehicle alto = new Car("Alto");
		IVehicle  corolla = new Car("Corolla");
		IVehicle  civic = new Car("Civic");
		
		ArrayList<IVehicle> vehicle = new ArrayList<>();
		vehicle.add(alto);
		vehicle.add(corolla);
		vehicle.add(civic);
		
		servant.CarWash(alto);
		servant.CarWash(civic);
		
		servant.CarRepair(alto);
		servant.CarRepair(corolla);
		
		servant.CarTunning(alto);
		servant.CarTunning(civic);
		
		for (IVehicle v : vehicle) {
        v.changeCondition();
		}
		
		// check Servant performance
	    if (CarServant.checkIfYouWillBeFired(vehicle)) {
	      System.out.println(servant.name + " will continue another day");
	    } else {
	      System.out.println("Poor " + servant.name + ". His days are numbered");
	    }
		
		
	}
}
