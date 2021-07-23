package mypack;

public class main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobile a=new Automobile(4,3,"manual");
		Automobile b=new Toto(6,5,"Automatic");
		Automobile c=new twowheeler(4,2,"both");
		
		twowheeler d=new cycle(2,0,"none");
		twowheeler e=new motorcycle(2,2,"manual");
		
		a.run();
		a._break();
		a.change_direction();
		
		b.run();
		b._break();
		b.change_direction();
		
		c.run();
		c._break();
		c.change_direction();
		
		d.run();
		d._break();
		d.change_direction();
		
		e.run();
		e._break();
		e.change_direction();
		

	}

}
