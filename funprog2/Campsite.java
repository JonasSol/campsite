package funprog2;

class Campsite {
	public static char[] toStringClient;
	protected int area;
	protected String name;
	protected double price;
	protected String newReservation; // this is already in Client class?
	
	public Campsite(int area, String name, double price) {
		area = this.area;
		name = this.name;
		price = this.price;
	}
	
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}

	public void setName(String newName) {
		name = newName;
	}
	
	public int getArea() {
		return area;
	}
	
	
	// TODO INFO FROM LAB 30.03
	// method that returns position of spesific client. // (se below.)
	public int posReservation() {
		for (int i = 0; i<reservation.length; i++) {
			if (i = Client.ID) { // why not working?
				return i;
			}else {
				break;
			}
		} return posReservation();
	}
	
	// method to add a new reservation -  (this is already in client class)
	
	public String setNewReservation() {
		return newReservation;
	}
	
	
	// method to calculate price of a one accomodation - return a double, ...
	// ... get ID of accomoddation, nr of days,  ....
	// ... in the method: check in which position this accomodation is in the array, get the price, return the price.
	// ... With this pos you can use getprice from accomodation class.
	
	public static double calculatePrice() {
		double accPrice = 0;
		boolean reservationFound = false;
		// should there not be something here?
		// yes - find pos (ID) in reserv-array, multiply by noDaysStay and price.
		for (int i = 0; i<reservation.length; i++) {
			if (reservation[i] = Client.ID) { // how to connect to Client Class?
				reservationFound = true;
				accPrice = (Accomodation.noDaysStay*price);
				break;
			}		
		}
			return accPrice;
	}
	// method also: show percentage of discount. - call discount method from client class
	public int showPercentage() {
		int percentage = 0;
		if(VIPCustomer.VIPCardNo = null) {
			percentage = 5;
		}else {
			percentage = 10;
		}
		return showPercentage();
		
	}
	
	
	// you must show all info regarding reservation  
	public String toString() {
		return area + "\n" + name + "\n" + price;
	}
	// method show reservations of client. (show as string). you need ID of client to pass this info.
	public String toStringClient() {
		for(int i=0; i<reservation.lenght; i++) {
			if (i = Client.ID){
				return Client.ID;
			}else break;
		}return Client.ID + "\n" + name + "\n" + area;
		
	}
	
	

	// how many cabins are free?
	
	public int freeCabins() {
		return freeCabins();
	}
	
	
	
	// in other method calculate webplatforms cut. 
	// ( pass all information in method)
	
	
	// instanceOf. -> used to know of an object belongs to a particular class. (put it in if condition)
	// use info to something bbq. 
	// ___
	// usfull: use equalsIgnoreCase() to compare IDs.


	
}
