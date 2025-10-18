/*Q12. Check Array is Palindrome or Not
Class: ArrayPalindrome
Functions:
void inputArray(int arr[])
boolean isPalindrome()
Logic: Compare arr[i] with arr[n-i-1].
*/

import java.util.*;

class ArrayPalindrome
{
	private int a[];
	void inputArray(int arr[])
	{
		a = arr;
	}

	boolean isPalindrome()
	{
		for(int i = 0; i < a.length/2; i++)
		{
			if(a[i] != a[a.length-i-1])
			{
				//System.out.println("Hi");
				return false;
			}
		}
		return true;
	}
}


public class Check_Array_Palindrome_CO
{
	public static void main(String x[])
	{
		ArrayPalindrome ap = new ArrayPalindrome();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the Element in Array: ");
		for(int  i = 0 ; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		ap.inputArray(a);
		
		boolean result = ap.isPalindrome();
		if(result)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}
}