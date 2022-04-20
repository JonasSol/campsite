package funprog2;

public class CleaningCo {
	String name = "Limpieza y Mantenimiento S.L.";
	float cleaningFee = 15;
	float materialsFee = 2;
	float calcCleaningFee = 0;
	
	
	public CleaningCo(String name, float cleaningFee, float materialsFee) {
		name = this.name;
		cleaningFee = this.cleaningFee;
		materialsFee = this.materialsFee;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public float getCleaningFee() {
		return cleaningFee;	
	}
	
	public float getMaterialsFee() {
		return materialsFee;
	}
	public String toString() {
		return name + "\n" + cleaningFee + "\n" + materialsFee;
	}
	
	
	public static void calcCleaningFee() {
		if (BBQ == true) {
			(calcCleaningFee + 2)
		} if else (cabin == true) {
			(calcCleaningFee + 15)
		}return calcCleaningFee;
			
		
	}
}