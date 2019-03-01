
public class Example2 {

	public static void main(String[] args) {
		Restaurant favLunchPlace = new Restaurant();
		Restaurant favDinnerPlace = new Restaurant();

		favLunchPlace.setName("Central Deli");
		favLunchPlace.setRating(4);

		favDinnerPlace.setName("Friends Cafe");
		favDinnerPlace.setRating(5);
		
		
		Restaurant[] restaurants = new Restaurant[2];
		restaurants[0] = favLunchPlace;
		restaurants[1] = favDinnerPlace;
		
		for(int i = 0; i < restaurants.length; i++) {
			Restaurant item = restaurants[i];
			item.print();
		}
		
		System.out.println("Bon apetit");

	}

}
