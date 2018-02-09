package virtualpetsamok;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

import java.util.Collection;

import org.junit.Test;

import virtualpetsamok.VirtualPet;

public class VirtualPetTest {

	private static final String PET_NAME = "Bilbo";

	private static final String PET_DESCRIPTION = "is doing well!";

	private VirtualPet underTest;

	@Test
	public void shouldCreatePetConstructor() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldHaveDefaultHungerLevel() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 0);
		int defaultHunger = underTest.getHunger();
		assertEquals(0, defaultHunger);
	}

	@Test
	public void shouldHaveVariedHungerLevel() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 0);
		int hungerLevel = underTest.getHunger();
		assertThat(hungerLevel, is(0));
	}

	@Test
	public void shouldHaveVariedHappinessLevel() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 10, 0, 0);
		int happinessLevel = underTest.getBoredom();
		assertEquals(10, happinessLevel);
	}

	@Test
	public void shouldHaveVariedThirstLevel() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 10, 0);
		int thirstLevel = underTest.getThirst();
		assertEquals(10, thirstLevel);
	}

	@Test
	public void tickShouldIncreaseAllNeedLevels() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 0);
		underTest.tick();
		int thirstLevel = underTest.getThirst();
		assertEquals(1, thirstLevel);
	}

	@Test
	public void shouldHavePetName() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 0);
		String petName = underTest.getName();
		assertEquals(PET_NAME, petName);
	}

	@Test
	public void shouldHavePetDescription() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 0);
		String petDescription = underTest.petDescription();
		assertEquals(PET_DESCRIPTION, petDescription);
	}

	@Test
	public void shouldHaveConstructorWithPetNameAndDescriptionOnly() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION);
		String petName = underTest.getName();
		assertEquals(PET_NAME, petName);
	}

	@Test
	public void shouldHaveConstructorWithPetNameAndDescription() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION);
		String petDescription = underTest.petDescription();
		assertEquals(PET_DESCRIPTION, petDescription);
	}

	@Test
	public void feedPetShouldDecreaseHungerLevel() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 0);
		underTest.feedPet();
		int hungerLevel = underTest.getHunger();
		assertEquals(-1, hungerLevel);
	}

	@Test
	public void waterPetShouldDecreaseThirstLevel() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 0);
		underTest.waterPet();
		int thirstLevel = underTest.getThirst();
		assertEquals(thirstLevel, -1);
	}

	@Test
	public void playWithPetShouldDecreaseBoredomeLevel() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 0);
		underTest.playWithPet();
		int boredomLevel = underTest.getBoredom();
		assertEquals(-1, boredomLevel);
	}

	@Test
	public void toStringShouldDisplayNameWithVitals() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 0);
		String petToString = underTest.toString();
		assertEquals((underTest.getName() + "\t|" + underTest.getHunger() + "\t|" + underTest.getThirst() + "\t|"
				+ underTest.getBoredom()), petToString);
	}
	
	@Test
	public void shouldHaveHealthLevel() {
		underTest = new VirtualPet(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 0);
		int healthLevel = underTest.getHealthLevel();
		assertThat(healthLevel, is(0));
		
	}
}