package Practice.DesignPatterns.StructuralDesign.Facade;

public class FuelInjector {
	private FuelPump fuelpump=new FuelPump();
	public void on() {
		System.out.println("Fuel pump is ready to inject fuel");
	}
	public void inject() {
		fuelpump.pump();
		System.out.println("Fuel injected...");
	}
	 public void off() {
		 System.out.println("Stopping Fuel injector..");
	    }

}
