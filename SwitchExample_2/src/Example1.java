import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int children;
		System.out.print("How many children? ");
		children = scnr.nextInt();

		int allowances; 
		//the applicant gets two allowance for each kid of the first two kids
		//then one allowance for each other kid 
		//the max number of allowances is seven
		
		switch(children) {
		case 0:
		case 1:
		case 2:
			allowances = children * 2;
			break;
		case 3:
		case 4:
			allowances = 4 +  children - 2;
			break;
		default:
			allowances = 7;
		}
		
		System.out.println("Number of allowances: " + allowances);
		
	}

}
