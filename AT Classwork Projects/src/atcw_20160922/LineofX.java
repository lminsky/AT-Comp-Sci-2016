package atcw_20160922;

import java.util.Scanner;

public class LineofX {
	public static void main(String[] args) {
		System.out.println("How long a line do you want?");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		for(int i = 1; i<= (size*size); i++) {
			if (i%2 == 1) System.out.print("X");
			else System.out.print("O");	
			if (i%size == 0) System.out.println();
		}
	}	
}
