/*Q10. Count Frequency of Each Element
Class: ArrayFrequency
Functions:
void inputArray(int arr[])
void countFrequency()
Logic: For each element, count how many times it appears using nested loop.
*/

import java.util.*;

class ArrayFrequency
{
	int a[];
	void inputArray(int arr[])
	{
		a = arr;
	}

	void countFrequency()
	{
		int tempArray[] = new int[a.length];
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
					System.out.println("Elements: " + a[i]);
				}
			}
		}
		if(count > 0)
		{
			System.out.println("Count: " + count);
		}
	} 
}

public class Count_Freq_of_Element_CO
{
	public static void main(String x[])
	{
		ArrayFrequency af = new ArrayFrequency();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		
		System.out.println("Enter the Element in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		af.inputArray(a);
	
		af.countFrequency();
	}
}