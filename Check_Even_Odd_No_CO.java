/*4. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.
*/

import java.util.*;

class NumberChecker
{
	public void isEven(int no)
	{
		if(no % 2 == 0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}

public class Check_Even_Odd_No_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		NumberChecker nc = new NumberChecker();
		nc.isEven(no);
	}
}