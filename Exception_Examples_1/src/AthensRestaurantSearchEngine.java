import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;

public class AthensRestaurantSearchEngine {
	public static void main(String[] args) throws IOException {
		
		Scanner file = new Scanner(new File("Athens_Dinner.csv")); //reading from a file rather from keyboard
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>(); //store restaurant objects here
		
		int i = 0;
		while(file.hasNextLine()) {
			String line = file.nextLine(); //read one line
			String[] cols = line.split(",");
			String name = cols[0];
			String number = cols[1];
			double rating =Double.parseDouble(cols[2]); 
			
			Restaurant restaurant = new Restaurant();
			restaurant.setName(name);
			restaurant.setNumber(number);
			restaurant.setRating(rating);
			
			restaurants.add(restaurant);
			i++;
		}
		// after reading the file and storing data in the array, we now want to offer the user
		//  the opportunity to search it
		while(true) {
			System.out.print("Do you want to (1) search by name, (2) search by rating, or (3) quit? ");
			int command = keyboard.nextInt();
			if(command == 3) break;
			if(command < 1 || command > 3) { System.out.println("Incorrect choice"); continue; }
			switch(command) {
			case 1:
				System.out.print("Enter a keyword: ");
				String keyword = keyboard.next();
				System.out.println("Searching for restaurants matching " + keyword + " ...");
				keyword = keyword.toLowerCase();
				boolean nameFound = false;
				for(Restaurant resto : restaurants) {
					String name = resto.getName().toLowerCase();
					if(name.contains(keyword)) {
						nameFound = true;
						resto.print();
					}
				}
				if(!nameFound) System.out.println("Sorry no matches were found");
				break;
			case 2:
				System.out.print("Enter a minimum rating: ");
				double rating = keyboard.nextDouble();
				System.out.println("Searching for restaurants with rating equal to or higher than " + rating + " ...");
				boolean ratingFound = false;
				for(Restaurant resto : restaurants) {
					if(resto.getRating() >= rating) {
						ratingFound = true;
						resto.print();
					}
				}
				if(!ratingFound) System.out.println("Sorry no matches were found");
			}
		}
		System.out.println("Good bye!");
		file.close(); //close the file to free up the resource
	}

}
