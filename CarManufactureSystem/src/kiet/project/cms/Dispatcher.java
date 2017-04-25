package kiet.project.cms;

public class Dispatcher {
	   private SportsCar SportsCar;
	   private HybridCar HybridCar;
	   
	   public Dispatcher(){
		   
	      SportsCar = new SportsCar();
	      HybridCar = new HybridCar();
	   }

	   public void dispatch(String request){
	      if(request.equalsIgnoreCase("SportsCar")){
	         SportsCar.show();
	      }
	      else{
	         HybridCar.show();
	      }	
	   }
	}