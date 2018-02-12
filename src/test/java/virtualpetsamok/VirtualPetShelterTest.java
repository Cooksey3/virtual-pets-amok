package virtualpetsamok;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	private static final String PET_NAME = "Bilbo";
	private static final String PET_DESCRIPTION = "is doing well";

	private VirtualPetShelter underTest;
	private Cat newPet;
	private RobotDog newPet2;

	@Before
	public void setup() {
		underTest = new VirtualPetShelter();

		newPet = new Cat(PET_NAME, PET_DESCRIPTION, 0, 0, 0, 0, "is happy", 0);
		newPet2 = new RobotDog("Chad", "", 0, 0, "", 0, null);

	}

	@Test
	public void shouldAddPetToShelter() {
		underTest.admitPet(newPet);
		VirtualPet findPet = underTest.findPet(PET_NAME);
		assertThat(findPet, is(newPet));
	}

	@Test
	public void shouldAddMultiplPetsToShelter() {
		String anotherPetName = "Chad";
		Dog newPet2 = new Dog(anotherPetName, "", 0, 0, 0, 0, "is unhappy", 0, anotherPetName);

		underTest.admitPet(newPet);
		underTest.admitPet(newPet2);

		Collection<VirtualPet> check = underTest.petList();

		assertThat(check, containsInAnyOrder(newPet, newPet2));
	}

	@Test
	public void shouldRemovePetFromShelterByName() {
		underTest.admitPet(newPet);
		underTest.adoptPet(PET_NAME);
		VirtualPet check = underTest.findPet(PET_NAME);
		assertThat(check, is(nullValue()));
	}

	@Test
	public void shouldFeedAllPets() {
		Dog newPet2 = new Dog("Chad", "", 0, 0, 0, 0, "is hungry", 0, null);
		RobotDog newPet3 = new RobotDog("Jimmy", "", 0, 0, "is hungry", 0, null);
		underTest.admitPet(newPet);
		underTest.admitPet(newPet2);
		underTest.admitPet(newPet2);
		underTest.feedAllOrganicPets();

		assertThat(newPet.getHunger(), is(-1));
		assertThat(newPet2.getHunger(), is(-1));
		assertThat(newPet3.getOil(), is(0));

	}

	@Test
	public void shouldWaterAllOrganicPets() {
		Dog newPet2 = new Dog("Chad", "", 0, 0, 0, 0, null, 0, null);
		underTest.admitPet(newPet);
		underTest.admitPet(newPet2);
		underTest.waterAllOrganicPets();

		assertThat(newPet.getThirst(), is(-1));
		assertThat(newPet2.getThirst(), is(-1));
	}

	@Test
	public void shouldPlayWithAllPets() {
		underTest.admitPet(newPet);
		underTest.admitPet(newPet2);
		underTest.playWithAllPets();

		assertThat(newPet.getBoredom(), is(-1));
		assertThat(newPet2.getBoredom(), is(-1));
	}

	@Test
	public void shouldPlayWithOnePet() {
		underTest.admitPet(newPet);
		underTest.admitPet(newPet2);
		underTest.playWithOnePet(PET_NAME);

		assertThat(newPet.getBoredom(), is(-1));
		assertThat(newPet2.getBoredom(), is(0));
	}

	@Test
	public void shouldTickAllPets() {
		underTest.admitPet(newPet);
		underTest.admitPet(newPet2);
		underTest.tickAllPets();
		assertThat(newPet.getBoredom(), is(1));
		assertThat(newPet2.getOil(), is(1));
	}

	@Test
	public void shouldOilAllRobots() {
		Dog dog = new Dog("", "", 0, 0, 0, 0, "", 0, null);
		underTest.admitPet(newPet);
		underTest.admitPet(newPet2);
		underTest.admitPet(dog);

		underTest.walkAllDogs();

		assertThat(newPet.getHealthLevel(), is(0));
		assertThat(newPet2.getHealthLevel(), is(2));
		assertThat(dog.getHealthLevel(), is(2));
	}

	@Test
	public void litterBoxShouldBeClean() {
		underTest.admitPet(newPet);

		String litterBoxStatus = underTest.getLitterBoxStatus();

		assertThat(litterBoxStatus, is("Clean"));
	}

	@Test
	public void litterBoxShouldBeDirty() {
		Cat cat = new Cat("", "", 0, 0, 0, 0, "", 0);
		underTest.admitPet(cat);
		underTest.tickAllPets();

		String litterBoxStatus = underTest.getLitterBoxStatus();

		assertThat(litterBoxStatus, is("Dirty"));
	}

	@Test
	public void cleanLitterBoxResetsPottyLevel() {
		underTest.admitPet(newPet);

		underTest.tickAllPets();
		underTest.cleanLitterBox();

		assertThat(underTest.getLitterBoxStatus(), is("Clean"));

	}

}