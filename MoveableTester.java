package warmup1;

public class MoveableTester {
	
	public static void main(String[] args) {
//		Moveable m1 = new DistanceMover();
//		m1.move(2);
		
		Moveable ma = distance ->System.out.println("this is my first lamda: "+distance);

			

	ma.move(2);
	}
}
