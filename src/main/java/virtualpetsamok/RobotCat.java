package virtualpetsamok;

public class RobotCat extends Robot {

	public RobotCat(String petName, String petDescription, int boredomLevel, int healthLevel, String happinessLevel,
			int oilLevel) {
		super(petName, petDescription, boredomLevel, healthLevel, happinessLevel, oilLevel);
	}

	public RobotCat(String petName, String petDescription) {
		super(petName, petDescription);
	}

	@Override
	public String toString() {
		return petName + "\t|\t|\t|" + oilLevel + "\t|" + boredomLevel + "\t|" + getHealthLevel() + "\t|"
				+ getHappinessLevel() + "\t|\t|\t|";
	}
}
