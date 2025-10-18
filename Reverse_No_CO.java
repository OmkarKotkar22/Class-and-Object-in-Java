/*11. Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.
*/

import java.util.*;

class NumberReverser
{
	void reverse(int no)
	{
		int temp = 0;
		int rev = 0;
		int rem = 0;
		while(no != 0)
		{
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.println("Reverse Number is: " + rev);
	}
}

public class Reverse_No_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		NumberReverser nr = new NumberReverser();
		nr.reverse(no);
	}
}