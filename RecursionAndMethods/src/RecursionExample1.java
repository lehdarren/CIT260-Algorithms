public class RecursionExample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10! = " + nonRecursiveFactorial(10));
		System.out.println("10! = " + recursiveFactorial(10));
	}
	
	/**
	 * calculate and return n! using
	 * n! = 1*2*3...n
	 * 0! = 1
	 * @param n
	 * @return
	 */
	public static int nonRecursiveFactorial(int n) {
		int result = 1;
		
		for (int i = 1; i <= n; i++)
		{
			result *= i;
		}
		
		return result;
	}
	
	/**
	 * calculate and return n! using
	 * n! = (n-1)! n
	 * 0! = 1
	 * @param n
	 * @return
	 */
	public static int recursiveFactorial(int n) {
		if(n == 0)
			return 1;
		
		return recursiveFactorial(n-1) * n;
	}

}
