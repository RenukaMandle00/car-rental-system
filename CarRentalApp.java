package carRentalSystemProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRentalApp 
{

      ArrayList<car> cars;
      ArrayList<customer> customers;
      ArrayList<rental> rentals;
     
     public CarRentalApp() 
     {
    	 cars = new ArrayList<car>();
    	 customers = new ArrayList<customer>();
    	 rentals = new ArrayList<rental>();
     }
     public void addCar(car Car) 
     {
    	 cars.add(Car);
     }
     
     public void addCustomer(customer Customer) 
     {
    	 customers.add(Customer);
     }
     
     public void rentCar(car Car, customer Customer, int days) 
     {   //isAvailable is true
    	 if(Car.isAvailable()) 
    	 {
    		 Car.rent();
    		 rentals.add(new rental(Car, Customer, days));
    	 }
    	 else 
    	 {
    		 System.out.println("Car is not available");
    	 }
     }
     
     public void returnCar(car Car) 
     {
    	 rental rentalToRemove = null;
    	 for(rental rental :rentals) 
    	 {
    		 if(rental.getCar()==Car) 
    		 {
    			 rentalToRemove = rental;
    			 break;
    		 }
    	 }
    	 if(rentalToRemove != null) 
    	 {
    		 rentals.remove(rentalToRemove);
    		 System.out.println("Car returned successfully.");
    	 }
    	 else 
    	 {
    		 System.out.println("Car was not rented.");
    	 }
     }
     
     public void menu() {
    	 Scanner scan = new Scanner(System.in);
    	 
    	 while(true) {
    		 System.out.println("==== Car Rental System ====");
    		 System.out.println("1. Rent a Car");
    		 System.out.println("2. Return a Car");
    		 System.out.println("3. Exit");
    		 System.out.println("Enter your choice: ");
    		 
    		 int choice = scan.nextInt();
    	     
    		 if(choice == 1) 
    		 {
    			 System.out.println("\n== Rent a Car ==\n");
    			 System.out.println("Enter your name: ");
    			 String customerName = scan.next();
    			 
    			 System.out.println("\nAvailable Cars: ");
    			 for(car Car : cars)
    			 {
    				 if(Car.isAvailable()) 
    				 {
    					 System.out.println(Car.getCar_id()+" - "+ Car.getCar_brand()+" - "+ Car.getCar_model());
    				 }
    			 }
    			 
    			 System.out.println("\nEnter the car ID you want to rent");
    			 String carId = scan.next();
    			  
    			 customer newCustomer = new customer(customerName, (customers.size()+1)); 
    			 addCustomer(newCustomer);
    			 
    			 car selectedCar = null;
    			 for(car Car : cars) 
    			 {
    				 if(Car.getCar_id().equals(carId) && Car.isAvailable()) 
    				 {
    					 selectedCar = Car;
    					 break;
    				 }
    			 }
    			 
    			 System.out.println("\nEnter the days you want to rent");
    			 int rentalDays = scan.nextInt();
    			 if(selectedCar!= null)
    			 {
    				 double totalPrice = selectedCar.calculatePrice(rentalDays);
    				 System.out.println("\n == Rental Information ==\n");
    				 System.out.println("Customer Id: "+ newCustomer.getCustomer_id());
    				 System.out.println("Customer Name: "+ newCustomer.getCustomer_Name() );
    				 System.out.println("Car: " + selectedCar.getCar_brand());
    				 System.out.println("Rental Days: " + rentalDays);
    				 System.out.println("Total Price: $"+ totalPrice);
    				 
    				 System.out.println("\nConfirm rental (Y/N): ");
    				 String confirm = scan.next();
    				 
    				 if(confirm.equalsIgnoreCase("Y")) 
    				 {
    					 rentCar(selectedCar, newCustomer, rentalDays);
    					 System.out.println("\nCar rented successfully.");
    				 }
    				 else 
    				 {
    					 System.out.println("\nRental canceled");
    				 }
    			 }
    			 else 
    			 {
    				 System.out.println("\nInvalid car selection or car not available for the rent.");
    			 }
    		 }
    		 else if(choice == 2 ) 
    		 {
    			 System.out.println("\n== Return a Car ==\n");
    			 System.out.println("Enter the car Id you want to return: ");
    			 String carId = scan.next();    
    			 
    			 car carToReturn = null;
    			 for(car Car :cars)
    			 {
    				 if(Car.getCar_id().equals(carId) && !Car.isAvailable())
    				 {
    					 carToReturn = Car;
    					 break;
    				 }
    			 }
    			
    			
    			 if(carToReturn != null)
    			 {
    				 customer Customer = null;
    				
    				 for(rental rental :rentals) 
    				 {
    					 if(rental.getCar() == carToReturn)
    					 {
    						 Customer = rental.getCustomer();
    						 break;
    					 }
    				 }
    			 
    			 if( Customer!=null)
    			 {
    				 returnCar(carToReturn);
    				 System.out.println("Car returned successfully by "+Customer.getCustomer_Name());
    			 }
    			 else 
    			 {
    				 System.out.println("Car was not rented or rental information is missing.");
    			 }
    			 }
    			 else {
    				 System.out.println("Invalid car ID or car is not rented");
    			 }
    		 }
    		 
    	 
    		 else if(choice==3)
    		 {
        		 break;
        	 }
        	 else 
        	 {
        		 System.out.println("Invalid choice.Please enter a valid option.");
        	 }
    }
  }
     
}

