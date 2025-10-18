/*16. Generate Multiplication Table
Create a class MultiplicationTable with a method printTable to print the table of a given number.
Explanation: Explains nested loops and formatted printing.
*/


import java.util.*;
class MultiplicationTable
{
	int a;
	void printable(int no)
	{
		a = no;
		int i = 1;
		while(i <= 10)
		{
			System.out.println("Multipliaction no: " + (a * i));
			i++;
		}
	}
}

public class Generate_Multiplication_Table_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		MultiplicationTable MT = new MultiplicationTable();
		
		MT.printable(no);
		//int result = MT.printable(no);
		//System.out.println("Multiplication of Number: " + result);
	}
}  