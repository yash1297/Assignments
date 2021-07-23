package mypack;

public class Hacker extends Programmer {

	@Override
	public void display() {
		// Error cannot override private method.
		super.display();
		System.out.println("Your code is hacked");
	}

	

}
