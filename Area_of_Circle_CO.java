/*10. Find the Area of a Circle
Create a class CircleArea with a method findArea that calculates the area given the radius.
*/

import java.util.*;

class CircleArea
{
	void findArea(double radius)
	{
		double area = (22/7) * radius * radius;
		System.out.println("Area of a Circle: " + area); 
	}
}

public class Area_of_Circle_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Area of Circle radius: ");
		double radius = sc.nextInt();

		CircleArea ca = new CircleArea();
		ca.findArea(radius);
	}
}