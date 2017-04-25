package kiet.project.cms;

import java.util.List;

public class Car implements IVehicle{
	
	private boolean isWashed;
	  private boolean isRepaired;
	  private boolean isTunned;
	  private boolean isGood;

	private final String name;
	 private String engineType;
	 private String manual;
	 private String automatic;
	 private String cng;
	 private List<String> features;

	 public Car(String name) {
	  this.name = name;
	 }

	public String getengineType() {
	  return engineType;
	 }

	 public void setengineType(String engineType) {
	  this.engineType = engineType;
	 }

	 public String getmanual() {
	  return manual;
	 }

	 public void setmanual(String manual) {
	  this.manual = manual;
	 }

	 public String getautomatic() {
	  return automatic;
	 }

	 public void setautomatic(String automatic) {
	  this.automatic = automatic;
	 }

	 public String getcng() {
	  return cng;
	 }

	 public void setcng(String cng) {
	  this.cng = cng;
	 }

	 public List<String> getfeatures() {
	  return features;
	 }

	 public void setfeatures(List<String> features) {
	  this.features = features;
	 }

	 public String getName() {
	  return name;
	 }

	 @Override
	 public String toString() {
	  return "Car [Name= " + name + ", Engine Type= " + engineType + ", Transmission Manual= "
	    + manual + ", Transmission Automatic= " + automatic + ", Fuel Type= " + cng
	    + ", Features= " + features + "]";
	 }
	 
	 public  void getWashed()
	 {
		 isWashed = true;
	 }
	 
	 public  void getRepaired()
	 {
		 isRepaired = true;
	 }
	 
	 public  void getTunned()
	 {
		 isTunned = true;
	 }
	 
	 public void changeCondition() {
		    if (isWashed || isRepaired || isTunned) {
		      isGood = true;
		    }
	 }
	 public boolean getCondition() {
		    return isGood;
		  }
	 public void show(){
	 System.out.println("Displaying Car");
	   }
	}
