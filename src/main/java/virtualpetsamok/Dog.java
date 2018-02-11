package virtualpetsamok;

public class Dog extends Organic implements Walkable {

	public Dog(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel,
			int healthLevel, String happinessLevel, int pottyLevel) {
		super(petName, petDescription, hungerLevel, boredomLevel, thirstLevel, healthLevel, happinessLevel, pottyLevel);
	}

	@Override
	public void walkDog() {
		healthLevel += 2;
		pottyLevel -= 2;
	}

	public int getPottyLevel() {
		return pottyLevel;
	}

}
