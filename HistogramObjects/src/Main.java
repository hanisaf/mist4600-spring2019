
public class Main {

	public static void main(String[] args) {
	      Histogram movieReviewScores = new Histogram();
	      movieReviewScores.setNumberOfBins(6);
	      
	      movieReviewScores.setBinValue(0, 1);
	      movieReviewScores.setBinValue(1, 2);
	      movieReviewScores.setBinValue(2, 2);
	      movieReviewScores.setBinValue(3, 4);
	      movieReviewScores.setBinValue(4, 5);
	      movieReviewScores.setBinValue(5, 3);
	      
	      movieReviewScores.printHistogram();

	}

}
