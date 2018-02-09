package virtualpetsamok;

public abstract class VirtualPet {

	protected String petDescription;
	protected String petName;
	//this should be for organic pets only
	protected int thirstLevel;
	protected int hungerLevel;
	protected int boredomLevel;
	protected int healthLevel = thirstLevel + hungerLevel + boredomLevel;

	public int getHunger() {
		return hungerLevel;
	}

	public int getBoredom() {
		return boredomLevel;
	}

	public int getThirst() {
		return thirstLevel;
	}

	public String getName() {
		return petName;
	}

	public String petDescription() {
		return petDescription;
	}

	public void feedPet() {
		hungerLevel -= 1;
	}

	public void waterPet() {
		thirstLevel -= 1;
	}

	public void playWithPet() {
		boredomLevel -= 1;
	}

	public void tick() {
		thirstLevel += 1;
		hungerLevel += 1;
		boredomLevel += 1;
	}

	@Override
	public String toString() {
		return petName + "\t|" + hungerLevel + "\t|" + thirstLevel + "\t|" + boredomLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}
}