/*6. Find the Maximum of Three Numbers
Create a class MaxFinder with a method findMax that returns the largest of three numbers.
Explanation: Enhances problem-solving using conditional statements.
*/

import java.util.*;

class MaxFinder
{
	void findMax(int a[])
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("Maximum Number in Array: " + max);

	}
}

public class Find_Max_No_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		//enter the size
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		//enter the value in array
		System.out.println("Enter the Value in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		MaxFinder mf = new MaxFinder();
		mf.findMax(a);
	}
}