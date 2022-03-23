package funprog2;

public class Cabin extends Accomodation{
	boolean numberOfBedrooms;
	boolean wifi;
	
	// constructors:
	public Cabin (int noPeople, int availability, int noDaysStay, boolean hasBBQ, boolean numberOfBedrooms, boolean wifi ) {
	super (noPeople, availability, noDaysStay, hasBBQ);
	
	this.numberOfBedrooms= numberOfBedrooms;
	this.wifi=wifi;
	}
	
	public boolean hasBarbeque() {
		return true;
	}	
	

	
	public String toString() {
		return super.toString() + "numberOfBedrooms" + numberOfBedrooms + "wifi" +  wifi;
 	}
	
	// setters and getters:
	
	
	public void setNumberOfBedrooms(boolean newumberOfBedrooms) {
		boolean newnumberOfBedrooms = false;
		numberOfBedrooms = newnumberOfBedrooms;
	}
	public boolean getwifi() {
		return wifi;
	}
	
	public void sethasBBQ(boolean newhasBBQ) {
		hasBBQ = newhasBBQ;
	}

	
	
}

