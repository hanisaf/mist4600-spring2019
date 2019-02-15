// 1- Declare a field called phoneNumber (String)
// 2- Create a method setPhoneNumber to set the value of phoneNumber
// 3- Edit print method to display the phone number

public class Restaurant { // Info about a restaurant
	private String name;
	private int rating;
	private String phoneNumber;
	
	//method implementation
	public void setName(String restaurantName) { // Sets the restaurant's name
		name = restaurantName;
	}

	public void setRating(int userRating) { // Sets the rating (1-5, with 5 best)
		rating = userRating;
	}

	/**
	 * sets the phone number
	 * @param number phone number e.g., 222-333-4444
	 */
	public void setPhoneNumber(String number) {
		//phoneNumber = number;
		this.phoneNumber = number;
	}
	
	public int getRating() {
		return rating;
	}
	
	/**
	 * Print the restaurant name, its rating and its phone number
	 */
	public void print() { // Prints name and rating on one line
		System.out.println(name + " -- " + rating + " -- " + phoneNumber);
	}
	
}