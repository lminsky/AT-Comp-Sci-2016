package atcs_20170106;

public class tryCatch {

	public static void main(String[] args) {
		int[] x = new int[5];
		
		try {
			int y = 5/0;
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Hello");
	}

}
