import java.io.File;
import java.io.IOException;
import java.util.Scanner;
//TODO 0 import HashMap
import java.util.HashMap;
public class HashMapExample3 {

	public static void main(String[] args) throws IOException {
		// (1) How many companies are associated each country in the file InternetCompanies.csv?
		// (2) what country has most companies?
		
		//TODO 1 create a hash map to keep track of number of companies per country
		HashMap<String, Integer> companyCountries = new HashMap<String, Integer>();
		Scanner fileReader = new Scanner(new File("InternetCompanies.csv"));
		// skip header from input
		fileReader.nextLine();
		// print output header
		//System.out.println("Company, Country, PSR, Rounded PSR");
		while (fileReader.hasNextLine()) {
			// read line by line
			String line = fileReader.nextLine();
			String[] cols = line.split(",");
			//String company = cols[0];
			String country = cols[1];
			//System.out.println(company + ", " + country);
			
			//TODO 2 update the hash map
			companyCountries.putIfAbsent(country, 0);
			companyCountries.put(country, 1 + companyCountries.get(country));
		}
		
		//TODO 3 display the hash map to answer (1)
		System.out.println("Companies per country : " + companyCountries);
		
		//TODO 4 process the hash map to answer (2)
		int maxV = -1;
		String maxK = null;
		for(String c : companyCountries.keySet()) {
			int v = companyCountries.get(c);
			if(v > maxV) {
				maxV = v;
				maxK = c;
			}
		}
		System.out.println(maxK + " has " + maxV + " companies");
		fileReader.close();
	}
}
