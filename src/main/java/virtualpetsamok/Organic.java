package virtualpetsamok;

public abstract class Organic extends VirtualPet {

	protected int hungerLevel;
	protected int thirstLevel;

	public Organic(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel,
			int healthLevel, String happinessLevel) {
		super(petName, petDescription, boredomLevel, healthLevel, happinessLevel);
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
	}

	public Organic(String petName, String petDescription) {
		super(petName, petDescription);
	}

	public int getHunger() {
		return hungerLevel;
	}

	public int getThirst() {
		return thirstLevel;
	}

	public void feedPet() {
		hungerLevel -= 1;
	}

	public void waterPet() {
		thirstLevel -= 1;
	}

	public int getBoredom() {
		return boredomLevel;
	}

	public void playWithPet() {
		boredomLevel -= 1;
	}

	@Override
	public int getHealthLevel() {
		healthLevel -= (boredomLevel + thirstLevel + hungerLevel);
		return healthLevel;
	}

	public String getName() {
		return petName;
	}

	public String getDescription() {
		return petDescription;
	}

	@Override
	public void tick() {
		boredomLevel += 1;
		thirstLevel += 1;
		hungerLevel += 1;
	}
}
