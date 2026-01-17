package Practice.DesignPatterns.CreationalDesign.AbstractFactory;

public class CenozoicAnimalFactory implements EraAnimalFactory{

	@Override
	public LandAnimal makeLandAnimal() {
		// TODO Auto-generated method stub
		return new LandAnimal(AnimalEra.CENOZOIC, "Mammoth");
	}

	@Override
	public SkyAnimal makeSkyAnimal() {
		// TODO Auto-generated method stub
		return new SkyAnimal(AnimalEra.CENOZOIC, "Terror bird");
	}

	public Animal createAnimal(AnimalType type) {
		// TODO Auto-generated method stub
		return null;
	}

}
