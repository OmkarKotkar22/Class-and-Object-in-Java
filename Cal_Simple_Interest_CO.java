/*5. Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time.
Explanation: Demonstrates mathematical formula implementation.
*/

import java.util.*;


class SimpleInterest
{
	void calSI(int principal, int rate, int time)
	{
		int SI = (principal * rate * time) / 100;
		System.out.println("Simple Interest: " + SI);
	}
}


public class Cal_Simple_Interest_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal: ");
		int principal = sc.nextInt();

		System.out.println("Enter the Rate: ");
		int rate = sc.nextInt();

		System.out.println("Enter the Time: ");
		int time = sc.nextInt();

		SimpleInterest si = new SimpleInterest();
		si.calSI(principal, rate, time);		
	}
}