package virtualpetsamok;

public class RobotDog extends Robot {

	public RobotDog(String petName, String petDescription, int oilLevel, int boredomLevel, int healthLevel, String happinessLevel) {
		super(petName, petDescription, oilLevel, boredomLevel, healthLevel, happinessLevel);
	}

	public RobotDog(String petName, String petDescription) {
		super(petName, petDescription);
	}

}
