package virtualpetsamok;

public abstract class Dog extends VirtualPet {

	public Dog(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel, int healthLevel) {
		this.petName = petName;
	}
	
	public void walkDog() {
		boredomLevel -= 1;
	}
	
}
