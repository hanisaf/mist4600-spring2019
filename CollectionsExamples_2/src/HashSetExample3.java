import java.util.HashSet;
import java.util.Random;

public class HashSetExample3 {

	public static void main(String[] args) {
		// shuffle numbers from 1 to 10
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		Random rand = new Random();
		
		int loopCounter = 0;
		
		while(numbers.size() != 10) {
			int r = rand.nextInt(10) + 1;
			boolean newNumber = numbers.add(r);
			if(newNumber)
				System.out.println(r);
			loopCounter++;
		}
		
		System.out.println("The loop looped " + loopCounter + " loops");
	}

}
