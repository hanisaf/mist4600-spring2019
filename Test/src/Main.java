
public class Main {

	public static void main(String[] args) {
		int i;
		
//		i=1;
//		System.out.println(i);
//		i=2;
//		System.out.println(i);
//		i=3;
//		System.out.println(i);
//		i=4;
//		System.out.println(i);
//		i=5;
//		System.out.println(i);
//		
		//repeat 5 times
		//  System.out.println(i);
		//  each time increase i by one
		
//		i = 1;
//		while( i <= 5 ) {
//			System.out.println(i);
//			i = i + 1;
//		}
		
		for(i = 1; i <= 5; i = i + 1 ) {
			System.out.println("Jump " + i);
			for(int j = 1; j <= 3; j++) {
				System.out.println("  Clap " + j + " ");
			}
			//System.out.println();
		}
		
	}

}
