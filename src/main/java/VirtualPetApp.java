import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		
		Pet myPet = new Pet(100, 0, 0);
		
		System.out.println("Your virtual pet is Johnathan the Giraffe!");
		System.out.println("How would you like to care for Johnathan?");
		System.out.println("Type \"hunger\" for food options to feed Johnathan");
		System.out.println("Type \"play\" for the different ways to play with Johnathan");
		System.out.println("Type \"sleep\" for the length of time you can let Johnathan sleep");
		String choice = input.nextLine();
		
		
		
	}

}
