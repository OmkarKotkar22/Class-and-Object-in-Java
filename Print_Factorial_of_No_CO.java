/*12. Find Factorial of a Number
Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
Explanation: Focuses on iterative or recursive logic.
*/

import java.util.*;

class FactorialCalculator
{
	void findFactorial(int no)
	{
		int f = 1;
		for(int i = 1; i <= no; i++)
		{
			f = f * i;
		}
		//System.out.println("factorial of a number: " + f);
		return f;
	}
}

public class Print_Factorial_of_No_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		FactorialCalculator fc = new FactorialCalculator();
		int result = fc.findFactorial(no);
		System.out.println("factorial of a number: " + result);

	}
}