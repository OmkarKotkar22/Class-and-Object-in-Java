/*9. Convert Celsius to Fahrenheit
Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
Explanation: Demonstrates unit conversion logic.
*/

import java.util.*;

class TemperatureConverter
{
	void convertToFahrenheit(double cel)
	{
		double fahr = (cel * 9 / 5) + 32;
		System.out.println("Fahrenheit Temperature: " + fahr);
	}
}

public class Cel_to_Fanh_CO
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Celsius Temp: ");
		double cel = sc.nextInt();

		TemperatureConverter TC = new TemperatureConverter();
		TC.convertToFahrenheit(cel);
	}
}