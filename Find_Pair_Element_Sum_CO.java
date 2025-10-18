/*Q14. Find Pair of Elements with Given Sum
Class: ArrayPairSum
Functions:
void inputArray(int arr[])
void findPairs(int target)
Logic: Check all pairs (i, j) where arr[i] + arr[j] == target.
*/

import java.util.*;

class ArrayPairSum
{
	int a[];
	void inputArray(int arr[])
	{
		a = arr;
	}

	void findPair(int target)
	{
		for(int i = 0; i < a.length; i++)
		{
			//System.out.print("[");
			for(int j = 0; j < a.length/2; j++)
			{
				if(a[i] + a[j] == target)
				System.out.print("[" + a[i] + ", " + a[j] + "]");
			}
			//System.out.print("]");
		}
	}
}

public class Find_Pair_Element_Sum_CO
{	
	public static void main(String x[])
	{
		ArrayPairSum ps = new ArrayPairSum();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the Element in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the Target Value: ");
		int target = sc.nextInt();


		ps.inputArray(a);

		ps.findPair(target);
	}
}