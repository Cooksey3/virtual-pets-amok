package virtualpetsamok;

public class Dog extends Organic implements Walkable {

	private int pottyLevel;

	public Dog(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel,
			int healthLevel, String happinessLevel) {
		super(petName, petDescription, hungerLevel, boredomLevel, thirstLevel, healthLevel, happinessLevel);
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
