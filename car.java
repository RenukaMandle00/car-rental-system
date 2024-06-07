package carRentalSystemProject;

public class car {
   private	String car_id;
   private String car_model;
   private String car_brand;
   private double car_basePrice;
   private boolean isAvailable;
  
   public car(String car_id, String car_model, String car_brand, double car_basePrice) {
	   this.car_id = car_id;
	   this.car_model=car_model;
	   this.car_brand = car_brand;
	   this.car_basePrice = car_basePrice;
	   this.isAvailable = true;
   }

public String getCar_id() {
	return car_id;
}

public void setCar_id(String car_id) {
	this.car_id = car_id;
}

public String getCar_model() {
	return car_model;
}

public void setCar_model(String car_model) {
	this.car_model = car_model;
}

public String getCar_brand() {
	return car_brand;
}

public void setCar_brand(String car_brand) {
	this.car_brand = car_brand;
}

public double getCar_basePrice() {
	return car_basePrice;
}

public void setCar_basePrice(double car_basePrice) {
	this.car_basePrice = car_basePrice;
}

public boolean isAvailable() {
	return isAvailable;
}

public void setAvailable(boolean isAvailable) {
	this.isAvailable = isAvailable;
}

public void rent() {
	 isAvailable = false;
}

public double calculatePrice(int rentalDays) {
	 return car_basePrice * rentalDays;
}

public void returnCar() {
	 isAvailable = true;
}
}
