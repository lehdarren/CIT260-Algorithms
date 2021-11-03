import java.util.*;
public class ArrayClass {
	private double[] rainArray = new double[12];
	private Scanner keyboard = new Scanner(System.in);
	
	public void setInfo()
	{
		
		double monthRain;
		
		for(int i = 0; i < rainArray.length; i++)
		{
			int counter = 1;
			
			while (counter == 1)
			{
				System.out.print("Please enter the rainfall for Month #" + (i + 1) + ": ");
				monthRain = keyboard.nextDouble();
				
				if(monthRain >= 0)
				{
					rainArray[i] = monthRain;
					counter = 0;
				}
				else
				{
					System.out.println("Error: Negative Number Detected");
				}
			}
		}
	}
	
	public double getAvgRainfall()
	{
		double avgRainfall = 0;
		double totalRainfall = 0;
		double monthInYear = 12;
		
		for(int i = 0; i < rainArray.length; i++)
		{
			totalRainfall += rainArray[i];
		}
		
		avgRainfall = totalRainfall / monthInYear;
		
		return avgRainfall;
	}
	
	public double getTotalRainfall()
	{
		double totalRainfall = 0;
		
		for(int i = 0; i < rainArray.length; i++)
		{
			totalRainfall += rainArray[i];
		}
		
		return totalRainfall;
	}
	
	public double getMostRainfall()
	{
		double highestAmt = rainArray[0];
		
		
		for(int i = 0; i < rainArray.length; i++)
		{
			if(highestAmt < rainArray[i])
			{
				highestAmt = rainArray[i];
			}
		}
		
		return highestAmt;
	}
	
	public double getLeastRainfall()
	{
		double smallestAmt = 0;
		
		for(int i = 0; i < rainArray.length; i++)
		{
			if(smallestAmt > rainArray[i])
			{
				smallestAmt = rainArray[i];
			}
		}
		
		return smallestAmt;
	}
}
