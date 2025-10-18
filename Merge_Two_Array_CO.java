/*Q9. Merge Two Arrays
Class: ArrayMerge
Functions:
void inputArray(int arr1[], int arr2[])
int[] mergeArrays()
Logic: Create new array of size arr1.length + arr2.length and copy both arrays into it.
*/

import java.util.*;

class ArrayMerge
{
	int a[];
	int b[];
	void inputArray(int arr1[], int arr2[])
	{
		a = arr1;
		b = arr2;
	}

	int[] mergeArrays()
	{
		int c[] = new int[a.length + b.length];
		for(int i = 0, j = a.length; i<a.length; i++, j++)
		{
			c[i] = a[i];
			c[j] = b[i];
		}
		return c;
	}
}

public class Merge_Two_Array_CO
{
	public static void main(String x[])
	{
		ArrayMerge am = new ArrayMerge();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of First Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the Elements in First Array: ");
		for(int  i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the Size of Second Array: ");
		size = sc.nextInt();

		int b[] = new int[size];

		System.out.println("Enter the Elements in Second Array: ");
		for(int  i = 0; i < b.length; i++)
		{
			b[i] = sc.nextInt();
		}

		am.inputArray(a, b);

		System.out.println("Display Merged Array: ");
		int result[] = am.mergeArrays();
		for(int i = 0; i < result.length; i++)
		{
			System.out.print(result[i] + " ");
		}
	}
}