import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int children;
		System.out.print("How many children? ");
		children = scnr.nextInt();

		int allowances; 
		//the applicant gets two allowance for each kid of the first two
		//then one allowance for each other kid 
		//the max number of allowances is seven
		
		switch(children) {
		case 0:
			allowances = 0;
			break;
		case 1:
			allowances = 2;
			break;
		case 2:
			allowances = 4;
			break;
		case 3:
			allowances = 5;
			break;
		case 4:
			allowances = 6;
			break;
		default:
			allowances = 7;
		}
		
		System.out.println("Number of allowances: " + allowances);
		
	}

}
