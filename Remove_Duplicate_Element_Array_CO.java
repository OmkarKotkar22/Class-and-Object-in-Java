/*Q13. Remove Duplicate Elements from Array
Class: ArrayRemoveDuplicate
Functions:
void inputArray(int arr[])
int[] removeDuplicate()
Logic: Use nested loop, copy only unique elements to new array.
*/

import java.util.*;

class ArrayRemoveDuplicate
{
	int a[];
	void inputArray(int arr[])
	{
		a = arr;
	}

	int[] removeDuplicate()
	{
		int count = 0;
		int b[] = new int[a.length];
		for(int i = 0; i < a.length; i++)
		{
			boolean flag = true;
			for(int j = 0; j < b.length; j++)
			{
				if(a[i] == b[j])
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				b[count] =  a[i];
				count++;
			}
		}
	return b;
	}
}

public class Remove_Duplicate_Element_Array_CO
{
	public static void main(String x[])
	{
		ArrayRemoveDuplicate rd = new ArrayRemoveDuplicate();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the Element in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		rd.inputArray(a);

		int result[] = rd.removeDuplicate();
		System.out.println("Removed Duplicate Elements: ");
		for(int i = 0; i < result.length; i++)
		{
			System.out.print(result[i] + " ");
		}
	}
}