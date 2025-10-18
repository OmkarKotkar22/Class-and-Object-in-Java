/*Q3. Calculate Average of Array Elements
Class: ArrayAverage
Functions:
void inputArray(int arr[])
double findAverage(int arr[])
Logic: Use sum ÷ total elements.
*/

import java.util.*;

class ArrayAverage
{
	int a[];
	void inputArray(int arr[])
	{
		a = arr;
	}

	double findAverage()
	{
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + a[i];
		}
		int avg = sum / arr.length;
		return avg;
		
	}
}
public class Cal_Avg_of_Array_No_CO
{
	public static void main(String x[])
	{
		ArrayAverage aa = new ArrayAverage();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		
		System.out.println("Enter the Elements in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		aa.inputArray(a);

		int result = (int)aa.findAverage(a);
		System.out.println("Average of all Element in Array: " + result);
		
	}
}