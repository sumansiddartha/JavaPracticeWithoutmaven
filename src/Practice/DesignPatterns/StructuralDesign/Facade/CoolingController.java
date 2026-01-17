package Practice.DesignPatterns.StructuralDesign.Facade;

public class CoolingController {
	
	 private static final Integer DEFAULT_RADIATOR_SPEED = 10;
	private Integer temperatureUpperLimit;
	private Radiator radiator=new Radiator();
	private TemparatureSensor temperatureSensor = new TemparatureSensor();
	public void setTemperatureUpperLimit(Integer temperatureUpperLimit) {
		System.out.println("Setting temperature upper limit to "+temperatureUpperLimit);
		this.temperatureUpperLimit=temperatureUpperLimit;
	}

	
	public void run() {
		System.out.println("cooling controller ready to run");
		radiator.setSpeed(DEFAULT_RADIATOR_SPEED);
	}
	public void cool(Integer maxAllowedTemp) {
		System.out.println("Scheduled cooling with maximum allowed temperature "+ maxAllowedTemp);
        temperatureSensor.getTemperature();
        radiator.on();
    }
	
	 public void stop() {
		 System.out.println("Stopping Cooling Controller..");
	        radiator.off();
	    }
}
