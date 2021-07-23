package mypack;

public class main_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a=new Rectangle(5,7);
		Circle b=new Circle(5);
		Square c=new Square(5,7,4);
		
		System.out.println("Area of Rectangle "+a.getArea());
		System.out.println("Perimeter of Rectangle "+a.getPerimeter());
		
		System.out.println("Area of Circle "+b.getArea());
		System.out.println("Perimeter of Circle "+b.getPerimeter());
		
		System.out.println("Area of Square "+c.getArea());

	}

}
