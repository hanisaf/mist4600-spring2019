
/**
 * Write a description of class Container here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Container
{
    private double weight;
    private String content;

    private String countryOfOrigin;
    /**
     * Constructor for objects of class Container
     */
    public Container(double w, String c)
    {
        weight = w;
        content = c;
    }
    
    public Container(double weight, String content, String countryOfOrigin) {
    	this(weight, content);
    	this.countryOfOrigin = countryOfOrigin;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public String getContent()
    {
        return content;
    }
        
    public String toString() {
    	String res = content + " " + weight;
    	if(countryOfOrigin != null) res += " from " + countryOfOrigin;
    	return res;
    }

    public String getCountryOfOrigin() {
    	return countryOfOrigin;
    }
}
