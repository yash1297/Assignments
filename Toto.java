package mypack;

public class Toto extends Automobile {
	

	
	
	public Toto(int no_wheels, int no_mirror, String gear) {
		super(no_wheels, no_mirror, gear);
		// TODO Auto-generated constructor stub
	}
	public void  run() {
		System.out.println(" Run from Toto");
	}
	public void _break() {
		System.out.println(" Break from Toto");
		
	}
	public void change_direction() {
		System.out.println(" change direction from Toto");
	}
}
