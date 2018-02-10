package virtualpetsamok;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RobotDogTest {

	private static final String PET_NAME = "Bilbo";
	private static final String PET_DESCRIPTION = "is a robot dog";
	private static final String PET_HAPPINESS = "Very happy.";

	Robot underTest = new RobotDog(PET_NAME, PET_DESCRIPTION, 0, 0, 0, PET_HAPPINESS);

	@Test
	public void oilPetShouldDecreaseOilLevel() {
		underTest.oilPet();
		int oilLevelAfter = underTest.getOil();
		assertThat(oilLevelAfter, is(-1));
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
		underTest.oilPet();
		int healthLevelAfter = underTest.getHealthLevel();
		assertThat(healthLevelBefore - healthLevelAfter, is(1));
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
		Dog underTest = new Dog(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 15, PET_HAPPINESS);
		String happinessLevel = underTest.getHappinessLevel();
		assertThat(happinessLevel, is("Very unhappy."));
	}
}