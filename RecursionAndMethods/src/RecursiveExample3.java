
public class RecursiveExample3 {
	public static void main(String[] args) {
		System.out.println(foo(5, 3));
		System.out.println(faa(18, 5));
		System.out.println(fee(5));
		System.out.println(laa(19, 5));
		System.out.println(loo(36));
	}
	
	public static int foo(int n, int m) {
		if(m == 0)
			return 1;
		return foo(n, m-1) * n;
	}
	
	public static int faa(int n, int m) {
		if(n < m)
			return n;
		return faa(n-m, m);
	}
	
	public static int fee (int n) {
		if(n==0)
			return 1;
		return 2 * fee(n - 1);
	}
	
	public static int laa(int n, int m) {
		if(n < m)
			return 0;
		return 1+laa(n-m, m);
	}
	
	public static int loo(int n) {
		if(n < 2)
			return 0;
		return 1 + loo(n / 2);
	}

}
