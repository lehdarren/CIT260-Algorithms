import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShapeTester {
	public static void main(String[] args) throws Exception {
		Rectangle rec1;
		
		Box box1;
		
		rec1 = new Rectangle(4, 3);
		
		System.out.println(rec1);
		System.out.println("Is rec1 square: " + rec1.isSquare());
		
		box1 = new Box(5, 3, 6);
		
		System.out.println(box1);
		System.out.println("area of box1: " + box1.area());
		System.out.println("volume of box1: " + box1.volume());
		
		try {
		System.out.println("testing isSquare: " + box1.isSquare());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		Cube cube1 = new Cube(4);
		
		System.out.println("cube1 is: " + cube1.toString());
		
		System.out.println("cube1 volume = " + cube1.volume());
		
		cube1.setAll(8);
		
		System.out.println("cube1 new volume = " + cube1.volume());
		
		//cube1.perimeter();
		
		Box box2 = (Box) box1.clone();
		
		System.out.println("Old box: " + box1.toString());
		System.out.println("New box: " + box2.toString());
		
		Rectangle rec2 = new Rectangle(2, 6);
		
		if(rec1.equals(rec2))
		{
			System.out.println("The two rectangles are the same");
		}
		else if (rec1.greaterThan(rec2))
		{
			System.out.println("rec1 has larger area");
		}
		else if (rec1.lessThan(rec2))
		{
			System.out.println("rec2 has larger area");
		}
		
		if(rec1.compareTo(rec2) == 0)
		{
			System.out.println("The two recs have the same area");
		}
		else if(rec1.compareTo(rec2) > 0)
		{
			System.out.println("rec1 has bigger area");
		}
		else
		{
			System.out.println("rec1 has smaller area");
		}
		
		ArrayList<Rectangle> list = new ArrayList();
		Random rand = new Random();
		
		for (int i = 0; i < 20; i++)
		{
			list.add(new Rectangle(rand.nextInt(100), rand.nextInt(100)));
		}
		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		//Collections.sort(list); //this is correct, eclipse is just fucking retarded.
		
		System.out.println("%%%%%%%%%%%%%%");
		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
