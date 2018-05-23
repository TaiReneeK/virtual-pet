import java.util.Random;

public class Pet {
	private int happiness;
	private int beauty;
	private int health;
	
	Random rand = new Random();
	
	public Pet(int happiness, int beauty, int health) {
		this.happiness = happiness;
		this.beauty = beauty;
		this.health = health;
	}


	public int getHappiness() 
	{
		return happiness;
	}

	public void hunger(int food) 
	{
		if (food > 0 && food <= 10) 
		{
			happiness += food;
		} 
		
		else if (food > 10)
		{
			happiness -= food;
		}
	}

	public int getBeauty() 
	{
		return beauty;
	}

	public void bath(int soap) 
	{
		if (soap > 10 && soap <= 20) 
		{
			beauty += soap;
		} 
		else if (soap > 20 || soap < 10)
		{
			beauty -= soap;
		}
	}
		
	public int getHealth() 
	{
		return health;
	}
	public void checkup(int vet) 
	{
		if (vet == 1) 
		{
			health += 10;
			happiness += 3;
		} 
		else if (vet != 1)
		{
			health -= 20;
		}
	}
	public void getStatus()
	{
			System.out.println("Happiness: " + happiness + ", " + "Beauty: " + beauty + ", " + "Health: " + health);
	}
	public void tick() 
	{
		if(happiness < 70)
		{
			happiness -= rand.nextInt(5);
			health -= rand.nextInt(10);
			System.out.println("Oh no! Masai's stats are dropping!");

		}
		
		else if(happiness >= 85)
		{
			beauty += rand.nextInt(23);
			System.out.println("You've made Masai very happy!");
		}
		
		else if(beauty <= 70)
		{
			happiness -= rand.nextInt(6);
			health -= rand.nextInt(5);
			System.out.println("Oh no! Masai's stats are low!");

		}
		
		else if(beauty >= 80)
		{
			System.out.println("Masai looks and feels beautiful!");
			health += rand.nextInt(15);
		}
		
		else if(health <= 80)
		{
			happiness -= rand.nextInt(3);
			beauty -= rand.nextInt(5);
			System.out.println("Oh no! Masai's stats are low!");
		}
		
		else
		{
			happiness += rand.nextInt(10);
			beauty += rand.nextInt(8);
		}
	}

}
