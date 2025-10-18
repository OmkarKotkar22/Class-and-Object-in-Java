/*Q4. Search an Element in Array
Class: ArraySearch
Functions:
void inputArray(int arr[])
boolean searchElement(int arr[], int key)
Logic: Traverse array, check if key matches any element.*/

import java.util.*;

class ArraySearch
{
	int a[];
	void inputArray(int arr[])
	{
		a = arr;
	}

	boolean searchElement(int skey)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == skey)
			{
				System.out.println("Search key is found: " + a[i]);
				return true;
			}
		}
		return false;
	}
}

public class Search_Element_in_Array_CO
{
	public static void main(String x[])
	{
		ArraySearch AS = new ArraySearch();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		
		System.out.println("Enter the Element in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Search key: ");
		int key = sc.nextInt();

		AS.inputArray(a);
		
		boolean result = AS.searchElement(key);
		if(result)
		{
	            System.out.println("Key " + key + " is present in the array.");
		}
		else
		{
	            System.out.println("Key " + key + " is not present in the array.");
		}
		
	}
}