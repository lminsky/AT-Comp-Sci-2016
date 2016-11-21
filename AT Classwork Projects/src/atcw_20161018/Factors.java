package atcw_20161018;

public class Factors {
	static int numFactors(int num){
		int count=0;
		for (int i = 1; i<=num; i++){
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] primes = new int[100];
		int index=0;
		for(int x=1;x<100;x++){
			int countFactors =0;
			for (int y=1;y<=x;y++){
				if (x%y == 0) countFactors++;
			}
			if (countFactors == 2){
				primes[index]=x;
				index++;
			}
		}
	}
}
