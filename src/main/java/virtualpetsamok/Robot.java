package virtualpetsamok;

public abstract class Robot extends VirtualPet {

	protected int oilLevel;

	public Robot(String petName, String petDescription, int boredomLevel, int healthLevel, String happinessLevel,
			int oilLevel) {
		super(petName, petDescription, boredomLevel, healthLevel, happinessLevel);
		this.oilLevel = oilLevel;
	}

	public Robot(String petName, String petDescription) {
		super(petName, petDescription);
	}

	public int getOil() {
		return oilLevel;
	}

	public void oilPet() {
		oilLevel -= 1;
	}

	@Override
	public int getHealthLevel() {
		healthLevel = 30 - (boredomLevel + oilLevel);
		return healthLevel;
	}

	@Override
	public void tick() {
		oilLevel += 1;
		boredomLevel += 1;
	}
}
