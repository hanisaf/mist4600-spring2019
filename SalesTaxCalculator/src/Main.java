import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
              /* Type your code here. */
              double price;
              double total;      
              Scanner keyboard = new Scanner(System.in); //keyboard
              
              System.out.print("Enter item value: $");
              price = keyboard.nextDouble();
              total = price + price*0.07;
              
              System.out.print("Total bill is: $");
              System.out.println(total);

        }

}