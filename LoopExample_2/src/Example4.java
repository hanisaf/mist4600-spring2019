
public class Example4 {

	public static void main(String[] args) {
		// Write a program that prints a 2x2 multiplication tables of numbers 1 to 10
		for(int i = 1; i <= 10; i++) {
			System.out.print( "\t" + i );
		}
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
			for(int j=1; j<= 10; j++) {
				System.out.print(i*j + "\t");
			}
//			System.out.print(i*1 + " ");
//			System.out.print(i*2 + " ");
//			System.out.print(i*3 + " ");
//			System.out.print(i*4 + " ");
//			System.out.print(i*5 + " ");
//			System.out.print(i*6 + " ");
//			System.out.print(i*7 + " ");
//			System.out.print(i*8 + " ");
//			System.out.print(i*9 + " ");
//			System.out.print(i*10 + " ");			
			System.out.println();
		}
	}

}
