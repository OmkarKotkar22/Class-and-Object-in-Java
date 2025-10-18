/*Q1. Find Maximum Element in Array
Class: ArrayMax


Functions:


void inputArray(int arr[]) → take array input
int findMax(int arr[]) → display maximum element
int findMin(int arr[]) → display minimum element
Logic: Loop through array, compare each element, store max.*/

import java.util.*;
class ArrayMax
{
	int Arr[];
	void inputArray(int arr[])
	{
		Arr = arr;
	}
	
	int findMax()
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(max < Arr[i])
			{
				max = Arr[i];
			}
		}
		//System.out.println("Maximum element in Array: " + max);
		return max;
	}


	int findMin()
	{
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(min > Arr[i])
			{
				min = Arr[i];
			}
		}
		//System.out.println("Maximum element in Array: " + min);
		return min;
	}
}


public class Find_Max_Min_No_Array_CO
{
	public static void main(String x[])
	{
		ArrayMax AM = new ArrayMax();

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("Enter the Elements in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		AM.inputArray(a);
		
		int MaxResult = AM.findMax(a);
		System.out.println("Maximum Element in Array: " + MaxResult);

		int MinResult = AM.findMin(a);
		System.out.println("Minimum Element in Array: " + MinResult);
	}
}