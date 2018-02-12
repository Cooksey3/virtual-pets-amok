package virtualpetsamok;

public abstract class Organic extends VirtualPet {

	protected int hungerLevel;
	protected int thirstLevel;
	protected int wasteLevel;

	public Organic(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel,
			int healthLevel, String happinessLevel, int wasteLevel) {
		super(petName, petDescription, boredomLevel, healthLevel, happinessLevel);
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.wasteLevel = wasteLevel;
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
		healthLevel = 30 - (boredomLevel + thirstLevel + hungerLevel + wasteLevel);
		return healthLevel;
	}

	@Override
	public String getHappinessLevel() {
		if (healthLevel > 15) {
			happinessLevel = "Happy";
		} else {
			happinessLevel = "Mad";
		}
		return happinessLevel;
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
		wasteLevel += 1;
	}
}
