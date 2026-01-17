package Practice.DefaultAndStatic;

public class Car implements Vehicle,Alarm {
	private String brand;
	

	public Car(String brand) {
		super();
		this.brand = brand;
	}

	public Car() {
		super();
		
	}



	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "Car is speeding up";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "Car is slowing down";
	}

	@Override
	public	String turnOnAlaram() {
		System.out.println(Alarm.super.turnOnAlaram());
		return Vehicle.super.turnOnAlaram() + " " + Alarm.super.turnOnAlaram();
	}
	@Override
	public
	String turnOffAlaram() {
		return Alarm.super.turnOffAlaram();
	}
	
}
