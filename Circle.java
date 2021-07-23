package mypack;

public class Circle extends shape {
	
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public double getArea() {
		return 2*PI*(radius*radius);
	}
	public double getPerimeter() {
		return 2*PI*radius;
	}

}
