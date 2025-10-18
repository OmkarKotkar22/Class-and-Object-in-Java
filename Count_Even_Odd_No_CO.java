/*Q5.Count Even and Odd Numbers
Class: ArrayEvenOdd
Functions:
void inputArray(int arr[])
int countEven(int arr[])
int countOdd(int arr[])
Logic: Use % 2 == 0 check.*/

import java.util.*;

class ArrayEvenOdd
{
	int a[];
	void inputArray(int arr[])
	{
		a = arr;
	}

	int countEven()
	{
		int Ecount = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(i % 2 == 0)
			{
				Ecount++;
			}
		}
		return Ecount;
	}

	int countOdd()
	{
		int Ocount = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(i % 2 != 0)
			{
				Ocount++;
			}
		}
		return Ocount;
	}
}

public class Count_Even_Odd_No_CO
{
	public static void main(String x[])
	{
		ArrayEvenOdd eo = new ArrayEvenOdd();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the Element in Array: ");
		for(int i = 0; i< a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		eo.inputArray(a);

		int evenResult = eo.countEven(a);
		System.out.println("Count of Even Element which present in Array: "+ evenResult);

		int oddResult = eo.countOdd(a);
		System.out.println("Count of Odd Element which present in Array: "+ oddResult);
	}
}