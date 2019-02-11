
// users of the class Restaurant
public class Main {
	public static void main(String[] args) {
		Restaurant favLunchPlace = new Restaurant();
		Restaurant favDinnerPlace = new Restaurant();
	
		int j = favLunchPlace.twice(4);
		System.out.println(j);
		favLunchPlace.setName("Central Deli");
		favLunchPlace.setRating(j);
		favLunchPlace.setPhoneNumber("333-333-333");
		String n = favLunchPlace.getName();
		int r = favLunchPlace.getRating();
		System.out.println(r);
		
		favLunchPlace.printTwice();
//		
//		favDinnerPlace.setName("Friends Cafe");
//		favDinnerPlace.setRating(5);
//		favDinnerPlace.setPhoneNumber("222-222-222");
//		
//		
//		System.out.println("My favorite restaurants: ");
//		favLunchPlace.print();
//		favDinnerPlace.print();
		
		
		
	}
}