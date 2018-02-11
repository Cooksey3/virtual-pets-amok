package virtualpetsamok;

public class Dog extends Organic implements Walkable {

	private String cageCleanliness;

	public Dog(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel,
			int healthLevel, String happinessLevel, int pottyLevel, String cageCleanliness) {
		super(petName, petDescription, hungerLevel, boredomLevel, thirstLevel, healthLevel, happinessLevel, pottyLevel);
		this.cageCleanliness = cageCleanliness;
	}

	@Override
	public void walkDog() {
		healthLevel += 2;
		pottyLevel -= 2;
	}

	public int getPottyLevel() {
		return pottyLevel;
	}

	public String getCageCleanliness() {
		if (pottyLevel > 4) {
			cageCleanliness = "Dirty";
		} else {
			cageCleanliness = "Clean";
		}
		return cageCleanliness;
	}

}
