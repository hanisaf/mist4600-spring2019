public class Restaurant { // Info about a restaurant
	private String name;
	private double rating;
	private String number;
	
	public void setName(String restaurantName) { // Sets the restaurant's name
		name = restaurantName;
	}

	public String getName() {
		return name;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setRating(double rating) throws RuntimeException { // Sets the rating (1-5, with 5 best)
		if(rating >=1 && rating <= 5)
			this.rating = rating;
		else
			throw new RuntimeException("Incorrect rating");
	}



	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public void print() { // Prints name and rating on one line
		System.out.println(name + " -- " + rating + " -- " + number);
	}
}