package atcw_20161001;
import java.util.Scanner;

public class Checkers {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("How big should the board be: ");
		Scanner input= new Scanner(System.in);
		int temp = input.nextInt();
		for(int x= 1; x<=temp/2; x++){
			for(int xx= 1; xx<=temp; xx++){
				if (xx % 2 != 0){
					System.out.print("X");
				}
				else{
					System.out.print("O");
				}
		}
			System.out.println("");
			for(int xo= 1; xo<=temp; xo++){
				if (xo % 2 != 0){
					System.out.print("O");
				}
				else{
					System.out.print("X");
				}
				
		}
		System.out.println("");
		}
			}
}
