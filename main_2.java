package mypack;

public class Assign_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  A c1 = new A();
		  c1.add();
		  c1.sub();
		  
		// First Complex number
		  Complex_A c2 = new Complex_A(6, 4);
		  System.out.println("Complex number 1 : "
                  + c2.getA() + " + i"
                  + c2.getB());
		// Second Complex number
		  Complex_A c3 = new Complex_A(3, 2);
		  System.out.println("Complex number 2 : "
                  + c3.getA() + " + i"
                  + c3.getB());
		 
		  Complex_A c4 = new Complex_A();
		  
	        // calling add() method
	        c4 = c4.add(c2, c3);
	 
	        // printing the sum
	        System.out.println("Sum of complex number : "
                    + c4.getA() + " + i"
                    + c4.getB());
	}

}
