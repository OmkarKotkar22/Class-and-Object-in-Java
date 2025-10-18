/*18. Check Leap Year
Create a class LeapYearChecker with a method isLeapYear to check if a year is a leap year.
Explanation: Implements logical conditions for leap year calculation.
*/

import java.util.*;
class LeapYearChecker
{
	void isLeapYear(int year)
	{
		if(year % 4 == 0 && year % 100 == 0 || year % 400 == 0)
		{
			System.out.println(year + " This Year is Leap Year");
		}
		else
		{
			System.out.println(year + " This Year is not Leap Year");
		}
	}
}

public class Check_Leap_Year_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = sc.nextInt();

		LeapYearChecker ly = new LeapYearChecker();
		ly.isLeapYear(year);
	}
}