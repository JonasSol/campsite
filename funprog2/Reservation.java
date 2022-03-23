package funprog2;

public class Reservation {	
	int IDReservation;
	int date;
	
	public Reservation(int IDReservation, int date) {
		IDReservation = this.IDReservation;
		date = this.date;
	}
	
	
	public void setIDReservation(int newIDReservation) {
		IDReservation = newIDReservation;	
	}
	
	public void setDate(Integer newDate) {
		date = newDate;
	}
	
	public boolean accomodationHasBBQ() {
		return Accomodation.HasBBQ();
	}
		
	public String toString() { 
		return Accomodation.toString() + "\n" + days + "\n" + ID;
		// This is not correct.
	}
	
}
