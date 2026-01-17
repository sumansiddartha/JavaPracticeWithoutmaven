package Practice.DefaultAndStatic;

public class MainToCheck {

	public static void main(String[] args) {
		Vehicle car=new Car("BMW");
		
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		System.out.println(car.turnOnAlaram());
		System.out.println(car.turnOffAlaram());


	}

}
