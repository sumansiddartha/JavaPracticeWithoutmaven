package Practice.DesignPatterns.CreationalDesign.AbstractFactory;

public abstract class Animal {
	AnimalEra era;
	AnimalType type;
	String name;
	public Animal(AnimalType type,AnimalEra era, String name) {
		super();
		this.era = era;
		this.type = type;
		this.name = name;
	}
	abstract void create();

}
