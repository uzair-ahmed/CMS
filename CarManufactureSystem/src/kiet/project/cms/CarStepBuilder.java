package kiet.project.cms;

import java.util.ArrayList;
import java.util.List;

public class CarStepBuilder {
		
		public static FirstNameStep newBuilder() {
	        return new Steps();
	}

	private CarStepBuilder() {
	}

	/**
	 * First Builder Step in charge of the Car name. 
	 * Next Step available : EngineTypeStep
	 */
	public static interface FirstNameStep {
	        EngineTypeStep carCalled(String name);
	}

	/**
	 * This step is in charge of the engineType. 
	 * Next Step available : TransmissionStep
	 */
	public static interface EngineTypeStep {
	        TransmissionStep engineType(String engineType);
	}

	/**
	 * This step is in charge of setting the main filling (manual or automatic). 
	 * manual choice : Next Step available : FuelStep 
	 * automatic choice : Next Step available : featurestep
	 */
	public static interface TransmissionStep{
	        FuelStep manual(String manual);

	        FuelStep automatic(String automatic);
	}

	/**
	 * This step is in charge of the cng. 
	 * Next Step available : featurestep
	 */
	public static interface FuelStep {
	        featurestep noCngPlease();

	        featurestep withCng(String cng);
	}

	/**
	 * This step is in charge of features. 
	 * Next Step available : BuildStep
	 */
	public static interface featurestep {
	        BuildStep noMoreFeaturesPlease();

	        BuildStep noFeaturesPlease();

	        featurestep addFeatures(String features);
	}

	/**
	 * This is the final step in charge of building the Car Object.
	 * Validation should be here.
	 */
	public static interface BuildStep {
	        Car build();
	}

	private static class Steps implements FirstNameStep, EngineTypeStep, TransmissionStep, FuelStep, featurestep, BuildStep {

	    private String name;
	    private String engineType;
	    private String manual;
	    private String automatic;
	    private String cng;
	    private final List<String> features = new ArrayList<String>();

	    public EngineTypeStep carCalled(String name) {
	            this.name = name;
	            return this;
	    }

	    public TransmissionStep engineType(String engineType) {
	            this.engineType = engineType;
	            return this;
	    }

	    public FuelStep manual(String manual) {
	            this.manual = manual;
	            return this;
	    }

	    public FuelStep automatic(String automatic) {
	            this.automatic = automatic;
	            return this;
	    }

	    public BuildStep noMoreFeaturesPlease() {
	            return this;
	    }

	    public BuildStep noFeaturesPlease() {
	            return this;
	    }

	    public featurestep addFeatures(String features) {
	            this.features.add(features);
	            return this;
	    }

	    public featurestep noCngPlease() {
	            return this;
	    }

	    public featurestep withCng(String cng) {
	            this.cng = cng;
	            return this;
	    }

	    public Car build() {
	    	Car car = new Car(name);
	    	car.setengineType(engineType);
	    	if(automatic != null)
	    	{
	    		car.setautomatic(automatic);
	    	}
	    	else
	    	{
	    		car.setmanual(manual);
	    	}
	    	if (cng != null)
	    	{
	    		car.setcng(cng);
	    	}
	    	if(! features.isEmpty() )
	    	{
	    		car.setfeatures(features);
	    	}
	  
	    	return car;
	    }
	}
}