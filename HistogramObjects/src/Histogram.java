
public class Histogram {
   
   // Array to store the bin values for each bin
   private int[] histogramData;
   private char barChar;
   // Default constructor creates an empty histogram
   public Histogram() {
      histogramData = null;
      barChar = '-';
      
   }
   
   public Histogram(char barChar) {
      histogramData = null;
      this.barChar = barChar;
   }
   // Alternate constructor creates a histogram with
   // the specified number of bins
   public Histogram(int numberBins) {
      histogramData = new int[numberBins];
   }
   
   // Sets the number of bins (previous data is deleted)
   public void setNumberOfBins(int numberBins) {
      histogramData = new int[numberBins];
   }

   // Sets the value for the bin at the specified index
   public void setBinValue(int binIndex, int binValue) {
      histogramData[binIndex] = binValue;
   }

   // Returns the value of the bin at the specified index
   public int getBinValue(int binIndex) {
      return histogramData[binIndex];
   }

   // Prints the histogram
   public void printHistogram() {
      int binIndex;
      int binValue;

      for (binIndex = 0; binIndex < histogramData.length; ++binIndex) {
         System.out.print(binIndex + " ");
         for (binValue = 0; binValue < histogramData[binIndex]; ++binValue) {
            System.out.print(barChar);
         }
         System.out.println();
      }
   }
}
