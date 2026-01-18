package Practice.DesignPatterns.CreationalDesign.AbstractFactory;

public class LandAnimal extends Animal{

	public LandAnimal(AnimalEra era, String name) {
		super(AnimalType.LAND, era, name);
		create();
	}

	@Override
	void create() {
		 System.out.println("Creating a " + type + " animal: " + name);
		
	}

}
