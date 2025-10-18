/*15. Swap Two Numbers
Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
Explanation: Covers mathematical operations for swapping.
*/


import java.util.*;

class Swapper
{
	int a, b;
	void swap(int no1, int no2)
	{
		a = no1;
		b = no2;
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("First NO: " + a);
		System.out.println("Second NO: " + b);
	}
	//return (a, b);
}

public class Swap_Two_No_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int no1 = sc.nextInt();

		System.out.println("Enter the Second Number: ");
		int no2 = sc.nextInt();	

		Swapper s = new Swapper();
		s.swap(no1, no2);
		//int result = s.swap(no1, no2);

		//System.out.println("Result: " + result);
		//System.out.println("Second NO: " + no2);
	}
}