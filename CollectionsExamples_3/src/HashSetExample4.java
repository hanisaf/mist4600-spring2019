import java.io.IOException;
import java.io.File;
import java.util.Scanner;

//TODO 0 import the hash set
import java.util.HashSet;

public class HashSetExample4 {

	public static void main(String[] args) throws IOException {
		// How many countries are there in the file InternetCompanies.csv
		int numberOfCountries = 0;
		
		//TODO 1 create a hash set to keep track of countries
		HashSet<String> countries = new HashSet<String>();
		
		Scanner fileReader = new Scanner(new File("InternetCompanies.csv"));
		// skip header from input
		fileReader.nextLine();
		// print output header
		//System.out.println("Company, Country, PSR, Rounded PSR");
		while (fileReader.hasNextLine()) {
			// read line by line
			String line = fileReader.nextLine();
			String[] cols = line.split(",");
			String country = cols[1];
			System.out.println(country);
			
			//TODO 2 add country to the hash set
			countries.add(country);
			//countries.add("USA");
		}
		
		//TODO 3 use the size method to get the number of countries
		numberOfCountries = countries.size();
		System.out.println("Number of countries = " + numberOfCountries);
		System.out.println("They are " + countries);
		fileReader.close();
	}

}
