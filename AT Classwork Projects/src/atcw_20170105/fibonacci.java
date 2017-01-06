package atcw_20170105;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fib(100, 0, 1);
	}
	
	static void fib(int index, int a, int b) {
		System.out.println(a + b);
		if(index > 0)
			fib(index-1, b, a+b);
	}

}
