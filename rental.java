package carRentalSystemProject;

public class rental {
	private car Car;
	private customer Customer;
	private int days;
	
	
	public rental() {
		super();
		// TODO Auto-generated constructor stub
	}

	public rental(car Car, customer Customer, int days) {
		this.Car = Car;
		this.Customer=Customer;
		this.days = days;
	}

	public car getCar() {
		return Car;
	}

	public customer getCustomer() {
		return Customer;
	}
	
	public int getDays() {
		return days;
	}

}
