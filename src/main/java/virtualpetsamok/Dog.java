package virtualpetsamok;

public class Dog extends Organic implements Walkable {

	private String cageCleanliness;

	public Dog(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel,
			int healthLevel, String happinessLevel, int wasteLevel, String cageCleanliness) {
		super(petName, petDescription, hungerLevel, boredomLevel, thirstLevel, healthLevel, happinessLevel, wasteLevel);
		this.cageCleanliness = cageCleanliness;
	}

	@Override
	public void walkDog() {
		healthLevel += 2;
		wasteLevel -= 2;
	}

	public int getWasteLevel() {
		return wasteLevel;
	}

	public String getCageCleanliness() {
		if (wasteLevel > 4) {
			cageCleanliness = "Dirty";
		} else {
			cageCleanliness = "Clean";
		}
		return cageCleanliness;
	}

	public void cleanCage() {
		wasteLevel = 0;
		healthLevel += 2;
	}

}
