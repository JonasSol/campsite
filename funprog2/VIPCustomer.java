package funprog2;

class VIPCustomer extends Client {
	public VIPCustomer() {
	// legg inn variablene fra father her også tror jeg?
		super(ID, name, creditCardNo, reservation);
		
	}
	
	public boolean hasBBQ() {
		return true;
	}
	
	public String toString(); {
		return super.toString() + "\n"; // I dont understand this
	}
	
	public double calculateDiscount() {
		double discount = 10;
		
		if (reservation > 1) { // operator don't work?
			discount += 5;
		return discount;
		}
	}
		
	
}
