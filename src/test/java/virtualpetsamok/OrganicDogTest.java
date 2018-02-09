package virtualpetsamok;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicDogTest {

	OrganicDog underTest = new OrganicDog("Bilbo", "is a dog", 0, 0, 0, 0);

	@Test
	public void walkDogShouldDecreaseBoredomLevel() {
		int boredomLevelBefore = underTest.getBoredom();
		underTest.walkDog();
		int boredomLevelAfter = underTest.getBoredom();
		assertThat(boredomLevelBefore - boredomLevelAfter, is(1));
	}

	@Test
	public void feedPetShouldDecreaseHungerLevel() {
		int hungerLevelBefore = underTest.getHunger();
		underTest.feedPet();
		int hungerLevelAfter = underTest.getHunger();
		assertThat(hungerLevelBefore - hungerLevelAfter, is(1));
	}

}