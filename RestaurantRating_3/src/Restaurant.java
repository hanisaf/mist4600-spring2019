// 1- Declare a field called phoneNumber (String)
// 2- Create a method setPhoneNumber to set the value of phoneNumber
// 3- Edit print method to display the phone number

public class Restaurant { // Info about a restaurant
	private String name;
	private int rating;
	private String phoneNumber;
	
	/**
	 * bla bla 
	 * @param x number
	 * @return 2*x
	 */
	public int twice(int x) {
		int y = x*2;
		//System.out.println(y);
		return y;
	}
	
	/**
	 * This methods sets the name of the restaurant
	 * @param restaurantName restaurant name
	 */
	public void setName(String restaurantName) { // Sets the restaurant's name
		name = restaurantName;
	}

	public void setRating(int rating) { // Sets the rating (1-5, with 5 best)
		if(rating >= 1) {
			if(rating <= 5) {
				this.rating = rating;
			}
		}
		/*
		if ( rating == 1 ) {
			this.rating = rating;
		}
		if ( rating == 2 ) {
			this.rating = rating;
		}
		if ( rating == 3 ) {
			this.rating = rating;
		}
		if ( rating == 4 ) {
			this.rating = rating;
		}
		if ( rating == 5 ) {
			this.rating = rating;
		}*/
		
	}

	public void printTwice() {
		print();
		print();
	}
	
	public void setPhoneNumber (String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getRating() {
		return rating;
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * returns the phone number of the restaurant
	 * @return the restaurant phone number
	 */
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void print() { // Prints name and rating on one line
		System.out.println(name + " -- " + rating + " -- " + phoneNumber);
	}
	
}