//Pizza Party
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// input 
		int people, pizzas;
		final int SLICES_PER_PIZZA = 8;
		int slicesPerPerson, leftoverSlices;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many people? ");
		people = keyboard.nextInt();
		System.out.print("How many pizzas do you have? ");
		pizzas = keyboard.nextInt();
		
		int slices = pizzas * SLICES_PER_PIZZA;
		slicesPerPerson = slices / people;
		leftoverSlices = slices % people;
		
		//output
		System.out.println();
		System.out.println(people + " people with " + pizzas + " pizzas");
		System.out.println("Each person gets " + slicesPerPerson + " slices of pizza.");
		System.out.println("There are " + leftoverSlices + " leftover slices.");
		

	}

}
