
public class Main {

	public static void main(String[] args) {
		Histogram gladiator = new Histogram();
		gladiator.setNumberOfBins(5);
		gladiator.setBinValue(0, 7);
		gladiator.setBinValue(1, 4);
		gladiator.setBinValue(2, 5);
		gladiator.setBinValue(3, 12);
		gladiator.setBinValue(4, 72);
		gladiator.printHistogram();
		
		Histogram pursuit = new Histogram('*');
		pursuit.setNumberOfBins(5);
		pursuit.setBinValue(0, 3);
		pursuit.setBinValue(1, 2);
		pursuit.setBinValue(2, 5);
		pursuit.setBinValue(3, 14);
		pursuit.setBinValue(4, 76);
		pursuit.printHistogram();		
		
	}

}
