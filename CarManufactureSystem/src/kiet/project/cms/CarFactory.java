//package kiet.project.cms;

//import java.util.ArrayList;

public class CarFactory {
	
	static CarServant jhangir = new CarServant("Jhangir");
	static CarServant haider = new CarServant("Haider");

	public static void main(String[] args) {

		//building car object
		Car alto = CarStepBuilder.newBuilder()
		        .carCalled("Alto")
		        .engineType("VXR")
		        .manual("Yes")
		        .withCng("CNG Fitted")
		        .addFeatures("Hood")
		        .addFeatures("Flash Lights")
		        .noMoreFeaturesPlease()
		        .build();
		System.out.println(alto);
		
		IVehicle corolla = CarStepBuilder.newBuilder()
				.carCalled("Corolla")
				.engineType("VVT-I Gli")
				.automatic("Yes")
				.noCngPlease()
				.addFeatures("Spoiler")
				.addFeatures("NOZ")
				.addFeatures("Hood")
				.noMoreFeaturesPlease()
				.build();
		System.out.println(corolla);
		
		
		Service service = new Service();
		service.scenario(jhangir);
		service.scenario(haider);
		
		
			 
	   		   
	   FrontController frontController = new FrontController();
	   
	   frontController.dispatchRequest("SportsCar");
       frontController.dispatchRequest("Hybridcar");
			   
		}
	}

