package mypack;

public class twowheeler extends Automobile {

	public twowheeler(int no_wheels, int no_mirror, String gear) {
		super(no_wheels, no_mirror, gear);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" Run from twowheeler");
	}

	@Override
	public void _break() {
		// TODO Auto-generated method stub
		System.out.println(" break from twowheeler");
	}

	@Override
	public void change_direction() {
		// TODO Auto-generated method stub
		System.out.println("change direction from twowheeler");
	}

}
