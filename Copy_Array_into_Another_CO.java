/*Q8.Copy Array Elements into Another Array
Class: ArrayCopy
Functions:
void inputArray(int arr[])
int[] copyArray()
Logic: Loop through source array and store elements into new array.
*/


import java.util.*;

class ArrayCopy
{
	int a[];
	void inputArray(int arr[])
	{
		a = arr;
	}

	int[] copyArray()
	{
		int b[] = new int[a.length];
		for(int i = 0; i < b.length; i++)
		{
			b[i] = a[i];
		}
		return b;
	}
}

public class Copy_Array_into_Another_CO
{
	public static void main(String x[])
	{
		ArrayCopy ac = new ArrayCopy();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the Elements in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		ac.inputArray(a);

		int result[] = ac.copyArray();
		System.out.println("Display the Copied Array: ");
		for(int i = 0; i < result.length; i++)
		{
			System.out.print(result[i] +" ");
		}
	}
}