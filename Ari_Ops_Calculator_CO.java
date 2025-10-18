/*2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/

import java.util.*;
class Calculator
{
	
	void add(int a, int b)
	{
		int c = a + b;
		System.out.println("Addition: " + c);
	}

	void subtract(int a, int b)
	{
		int c = a - b;
		System.out.println("subtraction: " + c);
	}

	void multiply(int a, int b)
	{
		int c = a * b;
		System.out.println("multiplication: " + c);
	}

	void divide(int a, int b)
	{
		int c = a / b;
		System.out.println("division: " + c);
	}
}

public class Ari_Ops_Calculator_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First No: ");
		int no1 = sc.nextInt();

		System.out.println("Enter the Second No: ");
		int no2 = sc.nextInt();

		Calculator c = new Calculator();
		c.add(no1, no2);
		c.subtract(no1, no2);
		c.multiply(no1, no2);
		c.divide(no1, no2);
	}
}