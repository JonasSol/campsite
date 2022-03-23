package funprog2;

public class Pitch extends Accomodation{
	int suitableForCamper;
	boolean hasBBQ;
	
	// constructors:
	
	public Pitch (int noPeople, int availability, int noDaysStay, int suitableForCamper, boolean hasBBQ) {
	super (noPeople, availability, noDaysStay);
	
	this.suitableForCamper= suitableForCamper;
	this.hasBBQ= hasBBQ;
	
	}
	public boolean hasBBQ() {
		return true;
	}
	
	
		public String toString() {
		return super.toString() + "suitableForCamper" + suitableForCamper + "hasBBQ" + hasBBQ;
	}
		
		// setters and getters:
		
		public void setsuitableForCamper(int suitableForCamper) {
			this.suitableForCamper = suitableForCamper;
		}
		
		public void sethasBBQ(boolean hasBBQ) {
			this.hasBBQ = hasBBQ;
		}

}
