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
        System.out.println("---- ---- ---- ---- ----");
        System.out.println("Ship name " + name);
        System.out.println("Empty weight " + emptyWeight);
        System.out.println("Total weight " + totalWeight);
        System.out.println("Containers on the ship:");
        for(Container c : containers)
            System.out.println(c.getContent() + " " + c.getWeight());
        System.out.println("---- ---- ---- ---- ----");    
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

    }
    
    //TODO implement the method remove container
    public void removeContainer(int i) 
    {

    }
    
    // more TODO -->
    /**
     * searches for the first container matching content
     * the match is partial and case insensitive
     * @param content
     * @return the first container matching content, null if none found
     */
    public Container getContainer(String content) {
    	return null;
    }
    
    /**
     * searches for all containers matching content
     * the match is partial and case insensitive
     * @param content
     * @return a list of containers matching content, null if none found
     */
    public ArrayList<Container> getContainers(String content) {
    	return null;
    }
}
