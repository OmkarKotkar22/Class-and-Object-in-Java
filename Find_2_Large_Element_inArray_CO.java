/*Q11. Find Second Largest Element
Class: ArraySecondLargest
Functions:
void inputArray(int arr[])
int findSecondLargest()
Logic: First find max, then find element just smaller than max.
*/

import java.util.*;

class ArraySecondLargest
{
	int a[];
	void inputArray(int arr[])
	{
		a = arr;
	}

	int findSecondLargest()
	{
		int max = a[0];
		int smax = Integer.MIN_VALUE;
		for(int i = 0; i < a.length; i++)
		{
			if(max < a[i])
			{
				smax = max;
				max = a[i];
			}

			else if(a[i] > smax && a[i]  < max)
			{
				smax = a[i];
			}
		}
		return smax;
	}
}

public class Find_2_Large_Element_inArray_CO
{
	public static void main(String x[])
	{
		ArraySecondLargest sl = new ArraySecondLargest();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		
		System.out.println("Enter the Elements in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		sl.inputArray(a);

		int result = sl.findSecondLargest();
		System.out.println("Second Largest Element: " + result);
	}
}