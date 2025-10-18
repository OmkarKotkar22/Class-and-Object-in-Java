/*8. Find Square of a Number
Create a class SquareFinder with a method square that calculates the square of a number.
Explanation: Covers single-parameter logic in methods.
*/


import java.util.*;

class SquareFinder
{
	void Square(int no)
	{
		int sq = no * no;
		System.out.println("Square of Given Number: " + sq);
	}
}
public class Square_of_No_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		SquareFinder SF = new SquareFinder();
		SF.Square(no);
	}
}