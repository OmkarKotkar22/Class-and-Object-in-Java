/*3. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.
*/

import java.util.*;

class NumberComparison
{
	void equal(int a, int b)
	{
		if(a == b)
		{
			System.out.println("No 1 and No 2 are Equal");
		}
	}

	void greater(int a, int b)
	{
		if(a > b)
		{
			System.out.println("No 1 is greater than No 2");
		}
		/*else
		{
			System.out.println("No 2 is greater than No 1");
		}*/
	}

	void less(int a, int b)
	{
		if(a < b)
		{
			System.out.println("No 1 is less than No 2");
		}
		/*else
		{
			System.out.println("No 2 is less than No 1");
		}*/
	}
}


public class Compare_Two_No_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int no1 = sc.nextInt();

		System.out.println("Enter the Second Number: ");
		int no2 = sc.nextInt();

		NumberComparison nc = new NumberComparison();

		nc.equal(no1, no2);
		nc.greater(no1, no2);
		nc.less(no1, no2);
	}
}