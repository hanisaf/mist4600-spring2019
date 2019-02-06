
// users of the class Restaurant
public class Main {
	public static void main(String[] args) {
		Restaurant favLunchPlace = new Restaurant();
		Restaurant favDinnerPlace = new Restaurant();
	
		favLunchPlace.setName("Central Deli");
		favLunchPlace.setRating(4);
		favLunchPlace.setPhoneNumber("333-333-333");
		
		favDinnerPlace.setName("Friends Cafe");
		favDinnerPlace.setRating(5);
		favDinnerPlace.setPhoneNumber("222-222-222");
		
		
		System.out.println("My favorite restaurants: ");
		favLunchPlace.print();
		favDinnerPlace.print();
		
		
		
	}
}