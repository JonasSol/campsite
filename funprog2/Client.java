package funprog2;

public class Client {
	protected static int ID;
	protected String name;
	protected int creditCardNo;
	protected Reservation[] reservation = new Reservation[5];
	static boolean doesClientExist = false;
	
	int noReservation; //check if more than 5.

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
	
	public void setNoReservation(int noReservation) {
		this.noReservation = noReservation;
	}
	
	
	public static boolean doesClientExist() {
		for (int i=0;i<reservation.length; i++)
			if (i==ID) {
				doesClientExist = true;
			}else continue;	
		return doesClientExist;
		
	}
	
	//  toString:
	public String toString() {
		return name + "\n" + ID + "\n" + creditCardNo;
	}
	
	// show only info regarding reservations (for loop)
	public Reservation[] toString1() {
		for (int i=0;i<reservation.length; i++)
			if (reservation[i]!=null) // maybe not necessary
				continue;
		return reservation;	
	}
	
	
}

