import java.util.*;
public class Main {
	public static void main(String args[]) 
	{
		
		ArrayClass rainfall = new ArrayClass();
		int selection;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("You have the following selections");
		System.out.println("1) Average Monthly Rain");
		System.out.println("2) Total Rain");
		System.out.println("3) Highest Monthly Rain");
		System.out.println("4) Lowest Monthly Rain");
		System.out.print("Please enter a Selection: ");
		
		selection = keyboard.nextInt();
		
		rainfall.setInfo();
		
		if(selection == 1)
		{
			double avgRain;
			avgRain = rainfall.getAvgRainfall();
			
			System.out.println("Your average rainfall is " + avgRain + " inches");
		}
		else if(selection == 2)
		{
			double totalRain;
			totalRain = rainfall.getTotalRainfall();
			
			System.out.println("Your total rainfall is " + totalRain + " inches");
		}
		else if(selection == 3)
		{
			double mostRain;
			mostRain = rainfall.getMostRainfall();
			
			System.out.println("The highest amount of rainfall is " + mostRain + " inches");
		}
		else if(selection == 4)
		{
			double leastRain;
			leastRain = rainfall.getLeastRainfall();
			
			System.out.println("The least amount of rainfall is " + leastRain + " inches");
		}
		
		keyboard.close();
	}
}
