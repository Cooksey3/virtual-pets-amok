package virtualpetsamok;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

public class OrganicCatTest {
	
	OrganicCat underTest = new OrganicCat("Bilbo", "is a dog", 0, 0, 0, 0);
	
	@Test
	public void feedPetShouldDecreaseHungerLevel() {
		int hungerLevelBefore = underTest.getHunger();
		underTest.feedPet();
		int hungerLevelAfter = underTest.getHunger();
		assertThat(hungerLevelBefore - hungerLevelAfter, is(1));	
	}
	
	@Test
	public void waterPetShouldDecreaseHungerLevel() {
		int thirstLevelBefore = underTest.getThirst();
		underTest.waterPet();
		int thirstLevelAfter = underTest.getThirst();
		assertThat(thirstLevelBefore - thirstLevelAfter, is(1));	
	}
	
}
