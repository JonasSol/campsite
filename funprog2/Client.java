package funprog2;

public class Client {
	protected int ID;
	protected String name;
	protected int creditCardNo;
	protected Reservation[] reservation = new Reservation[5];
	
	// constructors:
	public Client(int ID, String name, int creditCardNo) {
		ID = this.ID;
		name = this.name;
		creditCardNo = this.creditCardNo;
	}
	
	// setters and getters:
	public void setID(int newID) {
		ID = newID;
	}
	public void setName(String newName) {
		name = newName;
	}
	public int getCreditCardNo() {
		return creditCardNo;
	}

//  toString:
	public String toString() {
		return name + "\n" + ID + "\n" + creditCardNo;
	}
}

