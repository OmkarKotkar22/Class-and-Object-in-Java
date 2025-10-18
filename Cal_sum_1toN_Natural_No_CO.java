/*20. Calculate Sum of 1 to Nth Natural Numbers
Create a class NaturalNumberSum with a method calculateSum that computes the sum of the 1 to Nth natural numbers.
Explanation: Reinforces loops and arithmetic series formula.
*/

import java.util.*;
class NaturalNumberSum
{	
	void calculateSum(int no)
	{
		int sum = no * (no + 1)/2;
		
		System.out.println("Sum of " + no + " Natural Number is: " + sum);
	}
}
public class Cal_sum_1toN_Natural_No_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		NaturalNumberSum sum = new NaturalNumberSum();
		sum.calculateSum(no);
	}
}