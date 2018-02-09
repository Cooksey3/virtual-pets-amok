package virtualpetsamok;

public class OrganicDog extends Dog {

	public OrganicDog(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel, int healthLevel) {
		super(petName, petDescription, hungerLevel, boredomLevel, thirstLevel, healthLevel);
	}
	
	public void feedPet() {
		hungerLevel -= 1;
	}
	
	public void waterPet() {
		thirstLevel -= 1;
	}

}
