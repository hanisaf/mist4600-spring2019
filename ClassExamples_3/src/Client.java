/**
 * The class represents a Client for a credit card company
 * It stores information about the client's name, balance and points
 * It also stores information about the referring client
 * 
 * Business rules:
 * 1- each new client gets 10000 points
 * 2- If the client was referred by another client, the referring client
 *    receives 20000 points when the referred client makes the first transaction
 */

public class Client {
	private String name;
	private double balance;
	private int points;
	
	private boolean firstTransaction = true;
	private Client referringClient;
	
	private static final int welcomePoints = 10000;
	private static final int referringPoints = 20000;
	
	private static int clientCount = 0;
	
	public Client(String name) {
		this.name = name;
		this.points = welcomePoints;
		System.out.println("Welcome " + name);
		clientCount++;
	}
	
	
	public Client(String name, Client referringClient) {
		//this.name = name;
		//this.points = welcomePoints;
		this(name);
		this.referringClient = referringClient;
	}
	
	public int getPoints() { 
		return points; 
	}
	
	public String getName() { 
		return name; 
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void transact(double amount) {
		if(firstTransaction) {
			firstTransaction = false;
			if(referringClient != null) 
				referringClient.addPoints(referringPoints);			
		}
		balance = balance + amount;
	}
	
//  // Pyramid scheme implementation	
//	public void transact(double amount) {
//		if(firstTransaction) {
//			firstTransaction = false;
//			Client rc = referringClient;
//			double multiplier = 1.0;
//			while(rc != null) {
//				rc.addPoints((int) (multiplier * referringPoints));
//				multiplier = multiplier / 2;
//				rc = rc.referringClient;
//			}						
//		}
//		balance = balance + amount;
//	}
	
	public static int getClientCount() { return clientCount;}
	public void addPoints(int extraPoints) {
		if(extraPoints > 0) 
			points += extraPoints;
		else
			System.out.println("Incorrect points");
	}
	
	public static int getWelcomePoints() {
		return welcomePoints;
	}
	
	public static int getReferringPoints() {
		return referringPoints;
	}
	
	public String toString() {
		return "Client " + name + " has " + points + " points and a balance of $" + balance; 
	}
	
}
