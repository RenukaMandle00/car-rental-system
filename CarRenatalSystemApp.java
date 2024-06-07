package carRentalSystemProject;

public class CarRenatalSystemApp
{
	
	public static void main(String[] args) {
	
	CarRentalApp rentalsystem = new CarRentalApp();
	
	car Car1 = new car("C001", "Toyota", "Camry", 60.0);
	car Car2 = new car("C002", "Honda", "Accord", 70.0);
	car Car3 = new car("C003", "Mahindra", "Thar", 150.0);
	
	rentalsystem.addCar(Car1);
	rentalsystem.addCar(Car2);
	rentalsystem.addCar(Car3);
	
	
	rentalsystem.menu();
}
}
