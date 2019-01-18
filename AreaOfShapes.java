/** calcuate area of different geometric shapes
*/
import java.io.*;
import java.util.*;

/**
 @ smriti qainfotech
 */
public class AreaOfShapes 
{
	public static void main(String args [])
	{
	Scanner scanObj= new Scanner(System.in);
	String shapeOfobject=null;
	shapeOfobject= scanObj.nextLine();
	double area =0.0 ;
	
	if(shapeOfobject.equalsIgnoreCase("circle"))
	{
		System.out.println("ENTER THE RADIUS OF CIRCLE");
		double radius = scanObj.nextDouble();
		System.out.println("AREA OF "+ shapeOfobject + " "+ 3.14*radius*radius);
	}
	
	else if(shapeOfobject.equalsIgnoreCase("rectangle"))
	{
		System.out.println("ENTER THE DIMENSIONS OF RECTANGLE");
		double length = scanObj.nextDouble();
		double breadth = scanObj.nextDouble();
		System.out.println("AREA OF "+ shapeOfobject+ " "+ length*breadth);	 
	}
	else if(shapeOfobject.equalsIgnoreCase("square"))
	
	{
		System.out.println("ENTER THE SIDE OF SQUARE");
		double side = scanObj.nextDouble();
		System.out.println("AREA OF "+ shapeOfobject +" "+ (side*side));	 
	}
	
	else if(shapeOfobject.equalsIgnoreCase("triangle"))
	{
		System.out.println("ENTER THE DIMENSIONS OF TRIANGLE");
		double base = scanObj.nextDouble();
		double altitude = scanObj.nextDouble();
		System.out.println("AREA OF "+ shapeOfobject +" "+ (0.5* base*altitude));	
	}
	else 
	{ System.out.println("wrong input");
	}
	
	scanObj.close();
}
}

