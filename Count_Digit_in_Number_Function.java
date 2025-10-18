//Write a function to count the number of digits in a given number. use function

import java.util.*;
public class Count_Digit_in_Number_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		countDigit(no);
	}

	public static void countDigit(int no)
	{
		int count = 0;
		while(no != 0)
		{
			count++;
			no = no / 10;
		}
		System.out.println("Count of Digit in a Given Number: " + count);
	}
}