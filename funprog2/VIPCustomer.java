package funprog2;

public class VIPCustomer extends Client {
	int VIPCardNo;
	
	// constructor
	public VIPCustomer(int ID, String name, int creditCardNo, int VIPCardNo) {
		super (ID, name, creditCardNo);
		
		this.VIPCardNo = VIPCardNo;	
	}
	
	
	public boolean hasBarbeque() {
		return true;
	}
	
	
	public String toString() {
		return super.toString() + "VIPCardNo: " + VIPCardNo; 
	}
	
	public double calculateDiscount() {
		double discount = 10;
		if (reservation > 1) { // ask professor why this don't work.
			discount += 5;
		}
		return discount;
	}
	
	// setter
	public void setVIPCardNo(int newVIPCardNo) {
		int VIPCardNo = newVIPCardNo;
	}
	
	
}
