
public class GCDExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 28;
		int m = 18;
		System.out.printf("gcd(%d, %d) = %d\n", n, m, gcd(n,m));
	}
	
	public static int gcd(int n, int m) {
		if (n % m == 0)
			return m;
		return gcd(m, n % m);
	}

}
