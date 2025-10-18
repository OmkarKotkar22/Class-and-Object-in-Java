/*Q6. Reverse the Array
Class: ArrayReverse
Functions:
void inputArray(int arr[])
void reverseArray(int arr[])
*/


import java.util.*;

class ArrayReverse
{
	int a[];
	void inputArray(int arr[])
	{
		a = arr;
	}

	int reverseArray()
	{
		int start = 0;
		int end = a.length-1;

		while(start < end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;

		start++;
		end--;
		}



	}
}

public class Reverse_Array_CO
{
	public static void main(String x[])
	{
		ArrayReverse ar = new ArrayReverse();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		
		System.out.println("Enter the Element in array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		ar.inputArray(a);
		ar.reverseArray(a);

		System.out.println("Reversed Array: ");
        	for (int num : a)
		{
            		System.out.print(num + " ");
		}
	}
}
