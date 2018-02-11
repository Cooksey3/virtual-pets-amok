package virtualpetsamok;

public class RobotDog extends Robot implements Walkable {
	
	public RobotDog(String petName, String petDescription, int boredomLevel, int healthLevel, String happinessLevel, int oilLevel) {
		super(petName, petDescription, boredomLevel, healthLevel, happinessLevel, oilLevel);
	}

	public RobotDog(String petName, String petDescription) {
		super(petName, petDescription);
	}

	@Override
	public void walkDog() {
		healthLevel += 2;
	}

}
