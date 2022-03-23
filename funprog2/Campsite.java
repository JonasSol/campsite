package funprog2;

class Campsite {
	protected int area;
	protected String name;
	protected double price;
	
	
	// constructors:
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

	public String toString() {
		return area + "\n" + name + "\n" + price;
	}
}