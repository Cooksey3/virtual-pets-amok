package virtualpetsamok;

public abstract class Robot extends VirtualPet {

	protected int oilLevel;

	public Robot(String petName, String petDescription, int oilLevel, int boredomLevel,
			int healthLevel, String happinessLevel) {
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
		healthLevel = boredomLevel + oilLevel;
		return healthLevel;
	}
}