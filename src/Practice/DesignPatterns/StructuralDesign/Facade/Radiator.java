package Practice.DesignPatterns.StructuralDesign.Facade;

public class Radiator {
//	it will get on off setspeed
	public void on() {
		System.out.println("The radiator is on ");
	}
	public void off() {
		System.out.println("The radiator is off ");
	}
	public void setSpeed(Integer speed) {
		System.out.println("The speed of radiator is set to  "+speed);
	}

}
