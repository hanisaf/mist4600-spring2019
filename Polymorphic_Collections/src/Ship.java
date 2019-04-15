import java.util.ArrayList;
/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship
{
    // instance variables - replace the example below with your own
    private String name;    
    private double emptyWeight; //in kilo Tons
    private double totalWeight;
    private ArrayList<Container> containers;
    
    /**
     * Constructor for objects of class Ship
     */
    public Ship(String n, double weight)
    {
        // initialize instance variables
        emptyWeight = totalWeight = weight;
        name = n;
        containers = new ArrayList<Container>();
    }
    
    public double getTotalWeight() 
    {
        return totalWeight;
    }
    
    public double getEmptyWeight()
    {
        return emptyWeight;
    }
    
    public String getName()
    {
        return name;
    }
    
    /**
     * prints the ship name, its empty and total weight
     * for each container, print the content and weight of this container
     */
    public void report() 
    {
        System.out.println(toString());
    }
    
    /**
     * returns the total number of containers in the ship
     */
    public int getNumberOfContainers() 
    {
        return containers.size();
    }
    
    /**
     * returns the container at location i
     */
    public Container getContainer(int i) 
    {
        return containers.get(i);
    }
    
    
    // start here -->
    
    //TODO implement the method
    public void addContainer(Container c)
    {
    	if(c != null) {
        	containers.add(c);
        	totalWeight += c.getWeight();
    	}
    }
    
    //TODO implement the method remove container
    public void removeContainer(int i) 
    {
    	if(i >=0 && i < getNumberOfContainers()) {
        	Container c = containers.remove(i);
        	totalWeight -= c.getWeight();
    	} else {
    		System.out.println("Invalid container index");
    	}

    }
    
    // more TODO -->
    /**
     * searches for the first container matching content
     * the match is partial and case insensitive
     * @param content
     * @return the first container matching content, null if none found
     */
    public Container getContainer(String content) {
//    	for(Container c : containers) {
//    		if(c.getContent().toLowerCase().contains(content.toLowerCase()))
//    			return c;
//    	}
//    	return null;
    	ArrayList<Container> match = getContainers(content);
    	if(match != null)
    		return match.get(0);
    	else
    		return null;
    }
    
    /**
     * searches for all containers matching content
     * the match is partial and case insensitive
     * @param content
     * @return a list of containers matching content, null if none found
     */
    public ArrayList<Container> getContainers(String content) {
    	ArrayList<Container> match = new ArrayList<Container>();
    	for(Container c : containers) 
    		if(c.getContent().toLowerCase().contains(content.toLowerCase()))
    			match.add(c);
    	if(match.size() > 0)
    		return match;
    	else
    		return null;
    }
    
    public String toString() 
    {
    	String res = "";
        res = res + ("---- ---- ---- ---- ----") + "\n";
        res = res + ("Ship name " + name) + "\n";
        res = res + ("Empty weight " + emptyWeight) + "\n";
        res = res + ("Total weight " + totalWeight) + "\n";
        res = res + ("Containers on the ship:") + "\n";
        for(Container c : containers)
        	res = res + (c) + "\n";
        res = res + ("---- ---- ---- ---- ----") ;    
        return res;
    }
    
    public ArrayList<Container> getContainersFrom(String coo) {
    	ArrayList<Container> match = new ArrayList<Container>();
    	for(Container c : containers) 
    		if(c.getCountryOfOrigin().equalsIgnoreCase(coo))
    			match.add(c);
    	if(match.size() > 0)
    		return match;
    	else
    		return null;
    }

}
