package kiet.project.cms;

import java.util.List;

public class CarServant {
	
	public String name;
	
	public CarServant(String name){
		this.name = name;
	}
	
	
	public void CarWash(IVehicle v){
		//v.getWashed();
		System.out.println(v+" Washed");
	
	}
	
	public void CarRepair(IVehicle v){
		//v.getRepaired();
		System.out.println(v+" Repaired");
		
	}
	
	public void CarTunning(IVehicle v){
		//v.getTunned();
		System.out.println(v+" Tunned");
	
	}
	// Check performance of Servant
	 public static boolean checkIfYouWillBeFired(List<IVehicle> tableVehicle) {
		    boolean anotherDay = true;
		    
		    // loop for all table value
		    for (IVehicle v : tableVehicle) {
		    	
		    	//checking each table value condition
		      if (!v.getCondition()) {
		        anotherDay = false;
		      }
		    }

		    return anotherDay;
		  }
	

}
