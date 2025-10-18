/*13. Find Power of a Number
Create a class PowerCalculator with a method power that calculates base raised to an exponent.
Explanation: Demonstrates looping or recursion.
*/

import java.util.*;

class PowerCalculator
{
	int power(int base, int exponent)
	{
		int result = 1;
		for(int i = 1; i <= exponent; i++)
		{
			result = result * base;
		}
		return result;
	}
}


public class Print_Power_of_No_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the base: ");
		int base = sc.nextInt();

		System.out.println("ENter the exponent: ");
		int exponent = sc.nextInt();
		
		PowerCalculator pc = new PowerCalculator();
		int result =  pc.power(base, exponent);

		System.out.println("Power of the Number: " + result);
	
	}
}