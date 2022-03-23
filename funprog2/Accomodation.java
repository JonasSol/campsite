package funprog2;

public class Accomodation {
	int noPeople;
	int availability;
	int noDaysStay;
	
	public Accomodation(int noPeople, int availability, int noDaysStay) {
		noPeople = this.noPeople;
		availability = this.availability;
		noDaysStay = this.noDaysStay;
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
	
	public String toSring() {
		return noPeople + "\n" + availability + "\n" + noDaysStay;
	}
}