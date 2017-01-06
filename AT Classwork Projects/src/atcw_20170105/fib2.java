package atcw_20170105;

public class fib2 {

	public static void main(String[] args) {
		System.out.println(fib(7));
	}
	
	static int fib(int x) {
		if(x < 2)
			return 1;
		else
			return fib(x-1) + fib(x-2);
	}

}
