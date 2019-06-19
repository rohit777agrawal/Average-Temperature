import java.util.Scanner;

public class NumberAboveAverage {
	
	@SuppressWarnings("resource")
	public static void main(String [] args)
	
	{
		double[] temperature = new double[10];
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter ten days temperature!");
		
		double sum=0;
		
		for (int index =0; index<10; index++)
		{
			temperature[index]= keyboard.nextDouble();
			sum = sum + temperature[index];
		}
		double average = sum/10;
		
		System.out.println("The average temperature for 10 days is " + average);
		
		int days=0;
		
		for (int index = 0; index<10; index++)
		{
			if (temperature[index] > average)
			{
				System.out.println(temperature[index] + " is above average" );
				days++;
			}
			
		}
		System.out.println("The number of days it is above average is " + days);
		
		
	}
}
