package virtualpetsamok;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicDogTest {

	private static final String PET_NAME = "Bilbo";
	private static final String PET_DESCRIPTION = "is a dog";
	private static final String PET_HAPPINESS = "Very happy.";

	Organic underTest = new Dog(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 0, PET_HAPPINESS, 0);

	@Test
	public void feedPetShouldDecreaseHungerLevel() {
		int hungerLevelBefore = underTest.getHunger();
		underTest.feedPet();
		int hungerLevelAfter = underTest.getHunger();
		assertThat(hungerLevelBefore - hungerLevelAfter, is(1));
	}

	@Test
	public void waterPetShouldDecreaseThirstLevel() {
		int thirstLevelBefore = underTest.getThirst();
		underTest.waterPet();
		int thirstLevelAfter = underTest.getThirst();
		assertThat(thirstLevelBefore - thirstLevelAfter, is(1));
	}

	@Test
	public void playWithPetShouldDecreaseBoredomLevel() {
		int boredomLevelBefore = underTest.getBoredom();
		underTest.playWithPet();
		int boredomLevelAfter = underTest.getBoredom();
		assertThat(boredomLevelBefore - boredomLevelAfter, is(1));
	}

	@Test
	public void healthLevelShouldEqualSumOfOtherLevels() {
		int healthLevelBefore = underTest.getHealthLevel();
		underTest.feedPet();
		underTest.waterPet();
		int healthLevelAfter = underTest.getHealthLevel();
		assertThat(healthLevelBefore - healthLevelAfter, is(-2));
	}

	@Test
	public void shouldGetPetName() {
		String name = underTest.getName();
		assertThat(name, is("Bilbo"));
	}

	@Test
	public void shouldGetPetDescription() {
		String description = underTest.petDescription();
		assertThat(description, is(PET_DESCRIPTION));
	}

	@Test
	public void happinessLevelChangeWithOtherLevels() {
		String happinessLevel = underTest.getHappinessLevel();
		assertThat(happinessLevel, is(PET_HAPPINESS));
	}

	@Test
	public void happinessLevelChangeWithOtherLevelsBad() {
		Dog underTest = new Dog(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 15, PET_HAPPINESS, 0);
		String happinessLevel = underTest.getHappinessLevel();
		assertThat(happinessLevel, is("Very unhappy."));
	}

	@Test
	public void walkDogShouldIncreaseHealth() {
		Dog underTest = new Dog(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 15, PET_HAPPINESS, 0);
		underTest.walkDog();
		int healthLevel = underTest.getHealthLevel();
		assertThat(healthLevel, is(17));
	}

	@Test
	public void walkDogShouldDecreasePottyLevel() {
		Dog underTest = new Dog(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 15, PET_HAPPINESS, 0);
		underTest.walkDog();
		int pottyLevel = underTest.getPottyLevel();
		assertThat(pottyLevel, is(-2));
	}

	@Test
	public void tickShouldIncreasePottyLevel() {
		Dog underTest = new Dog(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 15, PET_HAPPINESS, 0);
		underTest.tick();
		int pottyLevel = underTest.getPottyLevel();
		assertThat(pottyLevel, is(1));
	}

	@Test
	public void cageIsSoiledIfPottyLevelIsGreaterThanFour() {
		Dog underTest = new Dog(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 15, PET_HAPPINESS, 4);
		underTest.tick();
		String cageCleanliness = underTest.getCageCleanliness();
		assertThat(cageCleanliness, is("Dirty"));
	}
}