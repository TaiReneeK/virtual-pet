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
	public void shouldHaveADefaultHappinessLevelOf305()
	{
		Pet underTest = new Pet(305, 0, 0);
		int check = underTest.getHappiness();
		assertEquals(305, check);
	}
	
	@Test
	public void shouldHaveHappinessLevelof75AfterHungerOf25()
	{
		Pet underTest = new Pet(100, 0, 0);
		underTest.hunger(25);
		int check = underTest.getHappiness();
		assertEquals(75, check);	
	}
	
	@Test
	public void shouldHaveHappinessLevelOf100AfterHungerOf0()
	{
		Pet underTest = new Pet(75, 0, 0);
		underTest.hunger(0);
		int check = underTest.getHappiness();
		assertEquals(100, check);
	}
	
	@Test
	public void shouldHaveHappinessLevelof85AfterPlayof0()
	{
		Pet underTest = new Pet(85, 0, 0);
		underTest.play(0);
		int check = underTest.getHappiness();
		assertEquals(100, check);
	}
	
	@Test
	public void shouldHaveHappinessLevelOf100AfterPlayOf15()
	{
		Pet underTest = new Pet(100, 0, 0);
		underTest.play(15);
		int check = underTest.getHappiness();
		assertEquals(85, check);
	}
	
	@Test
	public void shouldHaveHappinessLevelOf85AfterSleepOf15()
	{
		Pet underTest = new Pet(100, 0, 0);
		underTest.sleep(15);
		int check = underTest.getHappiness();
		assertEquals(85, check);
	}
	
	@Test
	public void shouldHaveHappinessLevelOf100AfterSleepOf0()
	{
		Pet underTest = new Pet(85, 0, 0);
		underTest.sleep(0);
		int check = underTest.getHappiness();
		assertEquals(100, check);
	}
	
	@Test
	public void shouldHaveBeautyLevelOf100AfterBrushOf0()
	{
		Pet underTest = new Pet(0, 75, 0);
		underTest.brush(0);
		int check = underTest.getBeauty();
		assertEquals(100, check);
	}
	
	@Test
	public void shouldHaveBeautyLevelOf75AfterBrushOf25()
	{
		Pet underTest = new Pet(0, 100, 0);
		underTest.brush(25);
		int check = underTest.getBeauty();
		assertEquals(75, check);
	}
	
	@Test
	public void shouldHaveBeautyLevelOf100AfterHaircutOf0()
	{
		Pet underTest = new Pet(0, 75, 0);
		underTest.haircut(0);
		int check = underTest.getBeauty();
		assertEquals(100, check);
	}
	
	@Test
	public void shouldHaveBeautyLevelOf75AfterHaircutOf25()
	{
		Pet underTest = new Pet(0, 100, 0);
		underTest.haircut(25);
		int check = underTest.getBeauty();
		assertEquals(75, check);
	}
	
	@Test
	public void shouldHaveBeautyLevelOf100AfterBathOf0()
	{
		Pet underTest = new Pet(0, 50, 0);
		underTest.bath(0);
		int check = underTest.getBeauty();
		assertEquals(100, check);
	}
	
	@Test
	public void shouldHaveBeautyLevelOf50AfterBathOf50()
	{
		Pet underTest = new Pet(0, 100, 0);
		underTest.bath(50);
		int check = underTest.getBeauty();
		assertEquals(50, check);
	}
	
	@Test
	public void shouldHaveHealthOf100AfterCheckupOf0()
	{
		Pet underTest = new Pet(0, 0, 50);
		underTest.checkup(0);
		int check = underTest.getHealth();
		assertEquals(100, check);
	}
	
	@Test
	public void shoudHaveHealthOf50AfterCheckupOf50()
	{
		Pet underTest = new Pet(0, 0, 100);
		underTest.checkup(50);
		int check = underTest.getHealth();
		assertEquals(50, check);
	}
	
	@Test
	public void shouldHaveHealthOf100AfterVitaminsOf0()
	{
		Pet underTest = new Pet(0, 0, 85);
		underTest.vitamins(0);
		int check = underTest.getHealth();
		assertEquals(100, check);
	}
	
	@Test
	public void shouldHaveHealthOf85AfterVitaminsOf15()
	{
		Pet underTest = new Pet(0, 0, 100);
		underTest.vitamins(15);
		int check = underTest.getHealth();
		assertEquals(85, check);
	}
	
	@Test
	public void shouldHaveHealthOf100AfterExerciseOf0()
	{
		Pet underTest = new Pet(0, 0, 65);
		underTest.exercise(0);
		int check = underTest.getHealth();
		assertEquals(100, check);
	}
	
	@Test
	public void shouldHaveHealthOf65AfterExerciseOf35()
	{
		Pet underTest = new Pet(0, 0, 100);
		underTest.exercise(35);
		int check = underTest.getHealth();
		assertEquals(65, check);
	}
}
