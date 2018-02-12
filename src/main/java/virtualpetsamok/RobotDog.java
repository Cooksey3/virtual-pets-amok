package virtualpetsamok;

public class RobotDog extends Robot implements Walkable {

	private String cageCleanliness;
	
	public RobotDog(String petName, String petDescription, int boredomLevel, int healthLevel, String happinessLevel,
			int oilLevel) {
		super(petName, petDescription, boredomLevel, healthLevel, happinessLevel, oilLevel);
	}

	public RobotDog(String petName, String petDescription) {
		super(petName, petDescription);
	}

	public void getCageCleanliness() {
		cageCleanliness = "Clean";
	}
	
	@Override
	public void walkDog() {
		healthLevel += 2;
	}

	@Override
	public String toString() {
		return petName + "\t|\t|\t|" + oilLevel + "\t|" + boredomLevel + "\t|" + getHealthLevel() + "\t|"
				+ getHappinessLevel() + "\t|\t|\t|";
	}
}
