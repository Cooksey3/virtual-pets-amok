package virtualpetsamok;

public class RobotCat extends Robot {

	public RobotCat(String petName, String petDescription, int boredomLevel, int healthLevel, String happinessLevel,
			int oilLevel) {
		super(petName, petDescription, boredomLevel, healthLevel, happinessLevel, oilLevel);
	}

	public RobotCat(String petName, String petDescription) {
		super(petName, petDescription);
	}

}
