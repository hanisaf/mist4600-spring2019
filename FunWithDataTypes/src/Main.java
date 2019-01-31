
public class Main {

	public static void main(String[] args) {
//		int n1 = 1;
//		int n2 = 0;
//		
//		System.out.println(n1 / n2);

		double x = 5.5;
		int y = 8;
		
		System.out.println(x);
		System.out.println(y);
		
		y  = (int) x; //casting, type conversion
		
		System.out.println(x);
		System.out.println(y);	
		
		int n = 2147483647;
		System.out.println(n);
		n =n + 10;
		System.out.println(n); //overflow

		System.out.println(Math.sqrt(y));
		
		int i = 6;
		
		
		System.out.println(i);		
		System.out.println(x);

		//x = i;
		i = (int) x; //type casting
		System.out.println(i);		
		System.out.println(x);

		int j = 2147483647;
		j = j + 10;
		System.out.println(j);
		
		//division over 0
		double i1 = -5, i2 = 0;
		System.out.println(i1/i2);
		
		double z = Math.sqrt(x);
		System.out.println(z);
		
	}

}
