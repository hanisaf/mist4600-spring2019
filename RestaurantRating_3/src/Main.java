
// users of the class Restaurant
public class Main {
	public static void main(String[] args) {
		Restaurant favLunchPlace = new Restaurant();

		favLunchPlace.setName("Central Deli");
		favLunchPlace.setRating(3);
		favLunchPlace.setRating(-10000);
		//favLunchPlace.rating = -10000;
		favLunchPlace.setRating(10000);

		favLunchPlace.setPhoneNumber("333-333-333");
		favLunchPlace.print();
		
	}
}