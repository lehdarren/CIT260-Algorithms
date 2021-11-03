
public class TowersOfHanoi {

	public static int counter = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		solveHanoi(n, 'A', 'B', 'C');
		System.out.println(counter);

	}
	
	public static void solveHanoi(int numDisks, char origin, char destination, char auxillary) {
		if(numDisks == 1) {
			System.out.printf("move from %c to %c\n", origin, destination);
			counter++;
		}
		else
		{
			//STEP 1
			solveHanoi(numDisks - 1, origin, auxillary, destination);
			//STEP 2
			solveHanoi(1, origin, destination, auxillary);
			//STEP 3
			solveHanoi(numDisks -1, auxillary, destination, origin);
		}
	}

}
