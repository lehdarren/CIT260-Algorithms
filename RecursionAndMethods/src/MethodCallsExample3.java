/*
 * Example of bad indirect recursion
 */
public class MethodCallsExample3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting main");
		methodA();
		System.out.println("Ending main");
		
	}
	
	public static void methodA() {
		System.out.println("Starting A");
		methodA();
		System.out.println("Ending A");
	}

}
