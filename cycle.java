package mypack;

public class cycle extends twowheeler {

	public cycle(int no_wheels, int no_mirror, String gear) {
		super(no_wheels, no_mirror, gear);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" Run from cycle");
	}

	@Override
	public void _break() {
		// TODO Auto-generated method stub
		System.out.println(" break from cycle");
	}

	@Override
	public void change_direction() {
		// TODO Auto-generated method stub
		System.out.println(" change direction from cycle");
	}

	
}
