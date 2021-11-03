
public class MethodCallsExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting main");
		methodA();
		System.out.println("Ending main");
		
	}
	
	public static void methodA() {
		System.out.println("Starting A");
		methodB();
		System.out.println("Ending A");
	}
	
	public static void methodB() {
		System.out.println("Starting B");
		methodC();
		System.out.println("Ending B");
	}
	
	public static void methodC() {
		System.out.println("Starting C");
		System.out.println("Ending C");
	}

}
