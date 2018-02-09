package virtualpetsamok;

public class RobotDog extends Dog {

	public RobotDog(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel,
			int healthLevel) {
		super(petName, petDescription, hungerLevel, boredomLevel, thirstLevel, healthLevel);
	}

	public void oilPet() {
		thirstLevel -= 1;
	}

	public void chargePet() {
		hungerLevel -= 1;
	}

}
