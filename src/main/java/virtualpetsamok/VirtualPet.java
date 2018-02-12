package virtualpetsamok;

public abstract class VirtualPet {

	protected String petDescription;
	protected String petName;
	protected int boredomLevel;
	protected String happinessLevel;
	protected int healthLevel;

	public VirtualPet(String petName, String petDescription, int boredomLevel, int healthLevel, String happinessLevel) {
		this.petDescription = petDescription;
		this.petName = petName;
		this.boredomLevel = boredomLevel;
		this.healthLevel = healthLevel;
		this.happinessLevel = happinessLevel;
	}

	public VirtualPet(String petName, String petDescription) {
		this.petName = petName;
		this.petDescription = petDescription;
		boredomLevel = 0;
	}

	public int getBoredom() {
		return boredomLevel;
	}

	public String getName() {
		return petName;
	}

	public String petDescription() {
		return petDescription;
	}

	public void playWithPet() {
		boredomLevel -= 3;
	}

	public void tick() {
		boredomLevel += 1;
	}

	public String getHappinessLevel() {
		return happinessLevel;
	}

	@Override
	public String toString() {
		return petName + "\t|" + boredomLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}
}