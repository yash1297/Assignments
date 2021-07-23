package mypack;

public class Automobile {
	int no_wheels,no_mirror;
	String gear;
	
	
	public Automobile(int no_wheels, int no_mirror, String gear) {
		super();
		this.no_wheels = no_wheels;
		this.no_mirror = no_mirror;
		this.gear = gear;
	}

	public void  run() {
		System.out.println(" Run from Automobile");
		
	}
	
	public void _break() {
		System.out.println(" Break from Automobile");
		
	}
	
	public void change_direction() {
		System.out.println(" change direction from Automobile");
	}
	
	

}
