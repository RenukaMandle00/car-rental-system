package carRentalSystemProject;

public class customer {
    private String customer_Name;
    private int customer_id;
    //private long customer_PhoneNo;
    
	public customer(String customer_Name, int customer_id) {
		super();
		this.customer_Name = customer_Name;
		this.customer_id = customer_id;
		//this.customer_PhoneNo = customerPhoneNo;
	}
	
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
//	public long getCustomer_PhoneNo() {
//		return customer_PhoneNo;
//	}
//	public void setCustomer_PhoneNo(int customer_PhoneNo) {
//		this.customer_PhoneNo = customer_PhoneNo;
//	}
}
