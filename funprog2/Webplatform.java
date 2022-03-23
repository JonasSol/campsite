package funprog2;

public class Webplatform {
	String name;
	int percentage;
	
	public Webplatform(String name, int percentage) {
		name = this.name;
		percentage = this.percentage;
	}
	
	public int getPercentage() {
		return percentage;
				
	}
	
	public String toString() {
		return name + "\n" + percentage;
	}
	
}
