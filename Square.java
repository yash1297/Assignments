package mypack;

public class Square extends Rectangle {
	int side;

	public Square(int length, int width, int side) {
		super(length, width);
		this.side=side;
		// TODO Auto-generated constructor stub
	}
	
	
	
    public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public double getArea() {
		return side*side;
	}
	

}
