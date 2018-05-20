
public class Pet 
{
	private int happiness;
	private int beauty;
	private int health;

	public Pet(int happiness, int beauty, int health) 
	{
		this.happiness = happiness;
		this.beauty = beauty;
		this.health = health;
	}

	public int getHappiness() 
	{
		return happiness;
	}
	
	public int getBeauty()
	{
		return beauty;
	}
	
	public int getHealth()
	{
		return health;
	}

	public void hunger(int amount)
	{
		if(amount > 0)
		{
			happiness -= amount;
		}
		else
		{
			happiness += 25;
		}
	}

	public void play(int amount) 
	{
		// The more he plays, the higher his happiness level should be but the less he
		// plays (the closer it is to 0), the happiness level should decrease
		if(amount > 0)
		{
			happiness -= amount;
		}
		else
		{
			happiness += 15;
		}
	}

	public void sleep(int amount) 
	{
		if(amount > 0)
		{
			happiness -= amount;
		}
		else
		{
			happiness += 15;
		}
	}

	public void brush(int amount) 
	{
		if(amount > 0)
		{
			beauty -= amount;
		}
		else
		{
			beauty += 25;
		}
	}

	public void haircut(int amount) 
	{
		if(amount > 0)
		{
			beauty -= amount;
		}
		else
		{
			beauty += 25;
		}
	}

	public void bath(int amount) 
	{
		if(amount > 0)
		{
			beauty -= amount;
		}
		else
		{
			beauty += 50;
		}
	}

	public void checkup(int amount) 
	{
		if(amount > 0)
		{
			health -= amount;
		}
		else
		{
			health += 50;
		}
	}

	public void vitamins(int amount) 
	{
		if(amount > 0)
		{
			health -= amount;
		}
		else
		{
			health += 15;
		}
	}

	public void exercise(int amount) 
	{
		if(amount > 0)
		{
			health -= amount;
		}
		else
		{
			health += 35;
		}
	}

}
