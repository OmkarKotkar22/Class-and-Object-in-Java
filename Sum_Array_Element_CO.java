/*Q2. Calculate Sum of Array Elements
Class: ArraySum
Functions:
void inputArray(int arr[])
int calculateSum(int arr[])
Logic: Traverse array and add all values to sum.
*/


import java.util.*;
class ArraySum
{
	int a[];
	void inputArray(int arr[])
	{
		a = arr;
	}

	int calculateSum()
	{
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + a[i];
		}
		return sum;
	}
}


public class Sum_Array_Element_CO
{
	public static void main(String x[])
	{
		ArraySum AS = new ArraySum();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		
		System.out.println("Enter the Element in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		AS.inputArray(a);

		int result = AS.calculateSum(a);
		System.out.println("Sum of All Element in Array: " + result);
	}
}