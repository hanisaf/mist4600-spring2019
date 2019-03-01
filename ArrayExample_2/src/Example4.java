
public class Example4 {

	public static void main(String[] args) {
		double[] prices = {33.4, 55.0, 109.99, 234.0, 66.6};

		//calculate the total amount in the shopping cart i.e., sum prices
//		double sum = 0.0;
//		for(int i = 0; i < prices.length; i++) {
//			double item = prices[i];
//			sum = sum + item;
//		}
//		System.out.println(sum);
		

//		double sum = 0.0;
//		int i = 0;
//		while (i < prices.length) {
//			double item = prices[i];
//			sum = sum + item;
//			i++;
//		}
//		System.out.println(sum);
		
		double sum = 0.0;
		for(double item : prices) {
			sum = sum + item;
		}
		System.out.println(sum);
		
		//There is a discount, the store will forgo the cents in each price, e.g., 33.4 will be 33
		//what is the new total price
	}
 
}
