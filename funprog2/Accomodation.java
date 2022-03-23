package funprog2;

abstract class Accomodation {
	protected int noPeople;
	protected int availability;
	protected int noDaysStay;
	protected boolean hasBBQ;
	
	public Accomodation(int noPeople, int availability, int noDaysStay, boolean hasBBQ) {
		noPeople = this.noPeople;
		availability = this.availability;
		noDaysStay = this.noDaysStay;
		hasBBQ = this.hasBBQ;
	}
	
	
	public void setNoPeople(int newNoPeople) {
		noPeople = newNoPeople;
	}
	
	public void setAvailability(int newAvailability) {
		availability = newAvailability;
		
	}
	
	public int getNoDaysStay() {
		return noDaysStay;
	}
	
	public boolean getHasBBQ() {
		return hasBBQ;
	}
	
	public void sethasBBQ(boolean hasBBQ) {
		this.hasBBQ = hasBBQ;
	}
	
	// need abstract method: has / has not BBQ.
	// implement in children classes.
	public boolean hasBBQ() {
		return hasBBQ;
	}
	
	public String toString() {
		return noPeople + "\n" + availability + "\n" + noDaysStay;
	}
}