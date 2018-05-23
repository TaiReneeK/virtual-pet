import static org.junit.Assert.*;

import org.junit.Test;

public class VirtualPetTest 
{
	@Test
	public void shouldHaveADefaultHappinessLevelOf100()
	{
		Pet underTest = new Pet(100, 0, 0);
		int check = underTest.getHappiness();
		assertEquals(100, check);
	}
	
	@Test
	public void shouldHaveADefaultHappinessLevelOf200()
	{
		Pet underTest = new Pet(200, 0, 0);
		int check = underTest.getHappiness();
		assertEquals(200, check);
	}
	
	@Test
	public void shouldHaveHappinessLevelOf80IfFoodEquals20()
	{
		Pet underTest = new Pet(100, 0, 0);
		underTest.hunger(20);
		int check = underTest.getHappiness();
		assertEquals(80, check);
	}
	
	@Test
	public void shouldHaveBeautyOf80AfterSoapLevelOf20()
	{
		Pet underTest = new Pet(0, 100, 0);
		underTest.bath(20);
		int check = underTest.getBeauty();
		assertEquals(80, check);
	}
	
	@Test
	public void shouldHaveHealthOf90AfterCheckupLevelOf10()
	{
		Pet underTest = new Pet(0, 0, 100);
		underTest.checkup(10);
		int check = underTest.getHealth();
		assertEquals(90, check);
	}
}
