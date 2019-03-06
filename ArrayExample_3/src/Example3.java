public class Example3 {

	public static void main(String[] args) {
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		//1 print the size of the months array i.e., how many months
		int l = months.length;
		System.out.println(l);
		//2 print the content of the months array, each month with its order e.g., 1 Jan 2 Feb ...
//		int monthNum = 0;
//		for(int i = 0; i < months.length; i++) {
//			monthNum++;
//			System.out.print(monthNum + " ");
//			System.out.print(months[i] + " ");
//		}

		for(int i =0; i<months.length; i++)
			System.out.print( (i+1) + " " + months[i] + " ");
		//3 do 2 in reverse order, e.g., 12 Dec 11 Nov ...
		System.out.println();
		
		for(int i = months.length-1; i >=0; --i)
			System.out.print( (i+1) + " " + months[i] + " ");
		System.out.println();
		//4 print odd number months
		for(int i =0; i<months.length; i++)
			if( i % 2 == 0)
				System.out.print( (i+1) + " " + months[i] + " ");
		System.out.println();
		//5 print even number months
		for(int i =1; i<months.length; i = i + 2)
			System.out.print( (i+1) + " " + months[i] + " ");

	}
 
}
