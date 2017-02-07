package atcw_20170207;

public class bubbleSort {

	public static void main(String[] args) {
		int[] a = {4, 1, 2, 5, 3};

		for(int i = a.length; i > 0; i--) {
			for(int j = 1; j < i; j++) {
				if(a[j-1] > a[j]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
