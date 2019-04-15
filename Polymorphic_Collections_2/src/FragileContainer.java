
public class FragileContainer extends Container {

	private String handlingInstructions;
   
	public FragileContainer(double weight, String content, String countryOfOrigin) {
    	super(weight, content, countryOfOrigin);
    	setHandlingInstructions("Handle with care");
    }

	public String getHandlingInstructions() {
		return handlingInstructions;
	}

	public void setHandlingInstructions(String handlingInstructions) {
		this.handlingInstructions = handlingInstructions;
	}
	
	public String toString() {
		return super.toString() + " (" + handlingInstructions.toUpperCase() + ")";
	}
    
}
