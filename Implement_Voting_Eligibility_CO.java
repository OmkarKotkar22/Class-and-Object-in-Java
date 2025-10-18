/*7. Implement Voting Eligibility
Create a class Voter with a method isEligible that checks if a person (age provided) is eligible to vote.
Explanation: Introduces basic logical validation.
*/

import java.util.*;

class Voter
{
	void isEligible(int age)
	{
		if(age >= 18)
		{
			System.out.println("Voter is Eligible for Vote");
		}
		else
		{
			System.out.println("Voter is not Eligible for Vote");
		}
	}
}
public class Implement_Voting_Eligibility_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int age = sc.nextInt();

		Voter v = new Voter();
		v.isEligible(age);
	}
}