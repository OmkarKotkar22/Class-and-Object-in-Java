/*Q15.Find Intersection of Two Arrays
Class: ArrayIntersection
Functions:
void inputArrays(int arr1[], int arr2[])
void findIntersection()
Logic:
Compare elements of arr1 with arr2.
If common element found, print it (but avoid duplicates).
*/

import java.util.*;

class ArrayIntersection
{
	int a[];
	int b[];
	void inputArray(int arr1[], int arr2[])
	{
		a = arr1;
		b = arr2;
	}

	void findIntersection()
	{
		int count = 0;
		int c[] = new int [a.length];
		for(int i = 0; i < a.length; i++)
		{
			boolean flag = false;
			//for intersection
			for(int j = 0; j < b.length; j++)
			{
				if(a[i] == b[j])
				{
					flag = true;
					//System.out.println("Intersection Elements: " + a[i]);
					break;
				}
			}
			if(flag)	
			{
				//for remove duplicate
				boolean duplicate = false;
				for(int k = 0; k < c.length; k++)
				{
					if(c[k] == a[i])
					{
						duplicate = true;
						break;
					}
				}
				if(!duplicate)
				{
					c[count] = a[i];
					count++;
					System.out.println("Intersection Elements: " + a[i]);
				}
			}
		}
		if(count == 0)
		{
			System.out.println("No Intersection Element");
		}
	}
}

public class Find_Intersection_2_Array_CO
{
	public static void main(String x[])
	{
		ArrayIntersection ai = new ArrayIntersection();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of First Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		
		System.out.println("Enter the Element in First Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}


		System.out.println("Enter the Size of Second Array: ");
		size = sc.nextInt();

		int b[] = new int[size];
		
		System.out.println("Enter the Element in Second Array: ");
		for(int i = 0; i < b.length; i++)
		{
			b[i] = sc.nextInt();
		}


		ai.inputArray(a, b);
	
		ai.findIntersection();
	}
}