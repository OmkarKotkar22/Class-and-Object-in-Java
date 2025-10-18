/*17. Calculate Sum of Digits
Create a class DigitSumCalculator with a method calculateSum that computes the sum of digits of a number.
Explanation: Practices loops for digit extraction.
*/

import java.util.*;
class DigitSumCalculator
{
	void calculateSum(int no)
	{
		int sum = 0;
		while(no != 0)
		{
			int rem = no % 10;
			sum = sum + rem;
			no = no / 10;
		}

		System.out.println("Sum of Digit: " + sum);
	}
}
public class Cal_Sum_Of_Digits_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		DigitSumCalculator dc = new DigitSumCalculator();

		dc.calculateSum(no);
	}
}