/*Q7. Sort Array in Ascending Order
Class: ArraySort
Functions:
void inputArray(int arr[])
void sortArray()
Logic: Use Bubble Sort / Selection Sort.
*/


import java.util.*;

class ArraySort
{
	int a[];
	void inputArray(int arr[])
	{
		a = arr;
	}	
	
	void sortArray()
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] > a[j])
				{
					//System.out.println("a[j] ==" + a[j] + " > " + a[j + 1]);
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					//System.out.print(a[i] + " ");
				}
			}
		}

		System.out.println("Display the Sorted Array: ");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}


public class Sort_Array_in_Ascending_CO
{
	public static void main(String x[])
	{
		ArraySort as = new ArraySort();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the Element in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		as.inputArray(a);
		as.sortArray();
	}
}