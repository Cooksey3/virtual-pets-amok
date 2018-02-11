package virtualpetsamok;

public class Cat extends Organic {

	public Cat(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel,
			int healthLevel, String happinessLevel, int pottyLevel) {
		super(petName, petDescription, hungerLevel, boredomLevel, thirstLevel, healthLevel, happinessLevel, pottyLevel);
	}
	
	public Cat(String petName, String petDescription) {
		super(petName, petDescription);
	}
}