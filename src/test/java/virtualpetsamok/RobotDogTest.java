package virtualpetsamok;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

public class RobotDogTest {
	
	RobotDog underTest = new RobotDog("Bilbo", "is a dog", 0, 0, 0, 0);
	
	@Test
	public void walkDogShouldDecreaseBoredomLevel() {
		int boredomLevelBefore = underTest.getBoredom();
		underTest.walkDog();
		int boredomLevelAfter = underTest.getBoredom();
		assertThat(boredomLevelBefore - boredomLevelAfter, is(1));
	}
	
	@Test
	public void oilPetShouldDecreaseHungerLevel() {
		int hungerLevelBefore = underTest.getHunger();
		underTest.oilPet();
		int hungerLevelAfter = underTest.getHunger();
		assertThat(hungerLevelBefore - hungerLevelAfter, is(1));
	}
}
