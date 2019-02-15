
public class Example1 {

	public static void main(String[] args) {
		boolean skyIsHigh = true;
		boolean skyIsRed = false;
		
		System.out.println("The sky is high and the sky is red: " + (skyIsHigh && skyIsRed));
		System.out.println("The sky is high or the sky is red: " + (skyIsHigh || skyIsRed));
		System.out.println("The sky is high or the sky is not red: " + (skyIsHigh && !skyIsRed));
		
	}

}
