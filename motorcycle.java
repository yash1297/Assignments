package mypack;

public class motorcycle extends twowheeler {

	public motorcycle(int no_wheels, int no_mirror, String gear) {
		super(no_wheels, no_mirror, gear);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" Run from motorcycle");
	}

	@Override
	public void _break() {
		// TODO Auto-generated method stub
		System.out.println(" break from motorcycle");
	}

	@Override
	public void change_direction() {
		// TODO Auto-generated method stub
		System.out.println("change direction from motorcycle");
	}

	
}
