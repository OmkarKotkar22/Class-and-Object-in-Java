/*19. Find GCD of Two Numbers
Create a class GCDCalculator with a method findGCD to compute the greatest common divisor of two numbers.
Explanation: Introduces loops and mathematical relationships.
*/


import java.util.*;
class GCDCalculator
{
	void findGCD(int no1, int no2)
	{
		int i = 1;
		int gcd = 0;
		while(i <= no1 && i <= no2)
		{
			if(no1 % i ==0 && no2 % i == 0)
			{
				gcd = i;
			}
		i++;
		}
		System.out.println("GCD of " + no1 + " & " + no2 + " is: " + gcd);
	}
}

public class Find_GCD_2_No_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int no1 = sc.nextInt();

		System.out.println("Enter the Second Number: ");
		int no2 = sc.nextInt();

		GCDCalculator gcd = new GCDCalculator();

		gcd.findGCD(no1, no2);
	}
}