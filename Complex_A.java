package mypack;

public class Complex_A extends A  {
	
	 Complex_A()
	    {
	    }

	 Complex_A(int real, int imaginary)
	    {
	        a = real;
	        b = imaginary;
	    }
	 Complex_A add(Complex_A C1, Complex_A C2)
	    {
	        // creating temporary variable
	        Complex_A temp = new Complex_A();
	 
	        // adding real part of complex numbers
	        temp.a = C1.a + C2.a;
	 
	        // adding Imaginary part of complex numbers
	        temp.b = C1.b + C2.b;
	 
	        // returning the sum
	        return temp;
	    }
	 Complex_A sub(Complex_A C1, Complex_A C2)
	    {
	        // creating temporary variable
	        Complex_A temp = new Complex_A();
	 
	        // adding real part of complex numbers
	        temp.a = C1.a - C2.a;
	 
	        // adding Imaginary part of complex numbers
	        temp.b = C1.b - C2.b;
	 
	        // returning the sum
	        return temp;
	    }
}
