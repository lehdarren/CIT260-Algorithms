public class RecursiveExample2 {

	private static int counter;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("50th Fibonacci number is " + recFib(100));
		System.out.println(counter);
	}
	
	/**
	 * find and return the n-th Fibonacci number using the recursive definition
	 * 1st and 2nd numbers are 1
	 * any other number is the sum of the two previous numbers
	 * @param n
	 * @return
	 */
	public static int recFib(int n) {
		counter++;
		if(n == 1 || n ==2)
			return 1;
		return recFib(n-1) + recFib(n-2);
	}

}
