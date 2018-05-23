import java.util.Random;
import java.util.Scanner;

public class VirtualPetApp 
{

	public static void main(String[] args) 
	{
		Pet myPet = new Pet(80, 75, 90);
		Scanner input = new Scanner(System.in);
		int happiness;
		int beauty;
		int health;
		String choice;
do
{
		System.out.println("Your virtual pet is Masai the Giraffe!");
		myPet.getStatus();
		System.out.println("Get Masai's stats to 100!");
		System.out.println();
		System.out.println("How would you like to care for Masai?");
		System.out.println("Type \"Happiness\" to feed Masai");
		System.out.println("Type \"Beauty\" to bathe Masai");
		System.out.println("Type \"Health\" to give Masai a checkup");
		System.out.println("Type \"Exit\" to neglect Masai");
		choice = input.next();
		

		if (choice.equalsIgnoreCase("happiness")) 
		{
			System.out.println("How many Acacia leaves do you want to feed Masai?");
			System.out.println("Enter a number from 1 to 10");
			System.out.println("Type \"0\" to check Masai's Status");
			int food = input.nextInt();	
			myPet.hunger(food);
			myPet.tick();
				
			if(food <= 10 && food > 0)
			{
				System.out.println("You've just fed Masai!");
			}
			
			else if(food > 10)
			{
				myPet.hunger(food);
				System.out.println("That's too many! Try again.");
			}
				
			else
			{
				myPet.getStatus();
				System.out.println();
				System.out.println("How many Acacia leaves do you want to feed Masai?");
				myPet.hunger(food);
				food = input.nextInt();
			}
		}
		
		else if (choice.equalsIgnoreCase("beauty"))
		{
			System.out.println("How long do you want to bathe Masai?");
			System.out.println(("Choose from 10 to 20 minutes"));
			System.out.println("Enter \"0\" to check the current stats");
			int soap = input.nextInt();
			myPet.bath(soap);
			myPet.tick();
			
			
			if (soap > 10 && soap <= 20) 
			{
				System.out.println("You gave Masai a bath!");
			}
			
			else if (soap > 20)
			{
				System.out.println("That's too much! Try again.");
			}
			
			else
			{
				myPet.getStatus();
				System.out.println();
				System.out.println("How long do you want to bathe Masai?");
				System.out.println(("Choose anything between 10 to 20 minutes"));
				myPet.bath(soap);
				soap = input.nextInt();
			}
		}
		
		else if (choice.equalsIgnoreCase("health"))
		{
			System.out.println("Do you want to take Masai to the vet?");
			System.out.println("Type 1 for yes or 2 for no");
			System.out.println("Enter \"0\" to check current stats");
			int vet = input.nextInt();
			myPet.checkup(vet);
			myPet.tick();
			
			if (vet == 1)
			{
				System.out.println("You took Masai to the vet!");
				System.out.println("He is healthy!");
			}
			
			else if (vet == 2)
			{
				System.out.println("You chose to not take Masai to the vet.");
				System.out.println("Good luck caring for a sick giraffe...");
			}
			
			else
			{
				System.out.println("That is not an option. Try again.");
			}
		}
		
		else if (choice.equalsIgnoreCase("exit"))
		{
			System.out.println("You've chosen to neglect Masai.");
			System.out.println("How do you sleep at night?");
			System.out.println("Thanks for playing!!");
			System.exit(0);
		}

   }
	while(!choice.equalsIgnoreCase("exit"));
	
	}
}
