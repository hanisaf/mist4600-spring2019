
public class Methods_Recap {

//	public static void print_twice(Integer i) {
//		System.out.println(i);
//		System.out.println(i);
//	}
	
//	public static void print_twice(String s) {
//		System.out.println(s);
//		System.out.println(s);
//	}
	
	public static void print_twice(Object s) {
		System.out.println(s);
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Methods_Recap.print_twice(5);
		
		Methods_Recap.print_twice("5");

	}

}
