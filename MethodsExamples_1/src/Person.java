
public class Person {
	private String name;
	private int strength;
	private boolean alive;
	private Person lover;
	
	public Person(String name) {
		this.name = name;
		alive = true;
	}
	
	public Person(String name, int strength) {
		this.name = name;
		this.strength = strength;
		alive = true;
	}
	
	public void setLover(Person p) {
		lover = p;
	}
	
	public void encounter(Person p) {
		if(p==lover) {
			if(p.isAlive()) {
				System.out.println(name + ": " + p.name + ", my love finally we meet");
			} else {
				System.out.println(name + ": " + p.name + ", my love, can't forgive myself it's too late");
				this.die();
			}
		} else {
			System.out.println(name + ": hey you, nothing will stop me");
			this.fight(p);
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isAlive() {
		return this.alive;
	}
	
	public int getStrength() {
		return this.strength;
	}
	
	public boolean isDead() {
		return !this.alive;
	}
	
	public void die() {
		System.out.println(name + ": ahhhhhhhh (" + name + " dies)");
		this.alive = false;
	}
	
	public void fight(Person p) {
		System.out.println(name + " fighting " + p.getName());
		if(strength >= p.strength) {
			p.die();
		} else {
			this.die();
		}
	}
	
}
