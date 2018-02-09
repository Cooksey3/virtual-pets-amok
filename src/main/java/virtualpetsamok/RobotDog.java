package virtualpetsamok;

public class RobotDog extends Dog {

	public RobotDog(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel, int healthLevel) {
		super(petName, petDescription, hungerLevel, boredomLevel, thirstLevel, healthLevel);
	}

	public void oilPet() {
		hungerLevel -= 1;
	}

}
