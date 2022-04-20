package funprog2;

public class Reservation extends Accomodation {	
	protected int IDReservation;
	protected int date;
	
	public Reservation(int noPeople, int availability, int noDaysStay, boolean hasBBQ, int IDReservation, int date) {
		super(noPeople, availability, noDaysStay, hasBBQ);
		IDReservation = this.IDReservation;
		date = this.date;
	}
	
	
	public void setIDReservation(int newIDReservation) {
		IDReservation = newIDReservation;	
	}
	
	public void setDate(Integer newDate) {
		date = newDate;
	}
	
	public boolean CabinHasBBQ() {
		return hasBBQ;
	}
		
	public String toString() { 
		return super.toString() + "date: " + date + "IDReservation: " + IDReservation;
		
	}

	// is this correct?
	@Override
	public boolean hasBBQ() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
	