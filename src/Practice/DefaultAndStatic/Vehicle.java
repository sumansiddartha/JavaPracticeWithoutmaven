package Practice.DefaultAndStatic;

public interface Vehicle {
	String getBrand();
	String speedUp();
	String slowDown();
	
	default String turnOnAlaram() {
		return "Turning the vehicle alaram on";
	}
	default String turnOffAlaram() {
		return "Turning the vehicle alaram off";
	}
	

}
