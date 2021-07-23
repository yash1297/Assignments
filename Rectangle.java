package mypack;

public class Rectangle extends shape {
	private int length, width;
	
	

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return 2*(length+width);
	}
}
