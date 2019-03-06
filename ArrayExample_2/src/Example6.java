
public class Example6 {

	public static void main(String[] args) {
		// multi-dimensional arrays
		
		//a sequence of numbers
		int[] numbers = new int[3];
		numbers[0] = 23;
		numbers[1] = 65;
		numbers[2] = 12;
		
		System.out.println();

		//let's say you want to store a table of numbers
		// 23, 44, 55
		// 65, 33, 98
		// 12, 43, 98
		
		//solution 1
		String[] numberTable = new String[3];
		numberTable[0] = "23, 44, 55";
		numberTable[1] = "65, 33, 98";
		numberTable[2] = "12, 43, 98";
		
		System.out.println();
		
		//the problem there is no way to access a cell directly
		
		//solution 2
		int[]	[] numTable = new int[3]	[3];
		
		numTable[0]	[0] = 23;
		numTable[0]	[1] = 44;
		numTable[0]	[2] = 55;

		numTable[1]	[0] = 65;
		numTable[1]	[1] = 33;
		numTable[1]	[2] = 98;
		
		numTable[2]	[0] = 12;
		numTable[2]	[1] = 43;
		numTable[2]	[2] = 98;
		
		System.out.println();
	}

}
