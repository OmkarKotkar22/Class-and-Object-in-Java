/*14. Check for Prime Numbers
Create a class PrimeChecker with a method isPrime to check if a number is prime.
Explanation: Introduces number theory logic.
*/

import java.util.*;

class PrimeChecker 
{
	void isPrime(int no) 
	{
		boolean flag = true;
	
		if (no <= 1)
		{
			flag = false;
		}
		else 
		{
			for (int i = 2; i <= no / 2; i++) 
			{
				if (no % i == 0) 
				{
					flag = false;
					break;
				}
			}
		}

		if (flag)
		{
			System.out.println(no + " is Prime");
		}
		else
		{
			System.out.println(no + " is Not Prime");
		}
	}
}

public class Check_Prime_No_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int no = sc.nextInt();
	
		PrimeChecker pc = new PrimeChecker();
		pc.isPrime(no);
	}
}
