package atcw_20161129;

/* Subject of Quiz
 * Arrays ; how to declare and being careful with the index
 * Methods; argument, return value
 * Classes; know constructors, know methods
 * 			know how to create an object and call its methods
 * 
 */

public class getReadyForQuiz {
	static int times2(int x){
		return x*2;
		//x=19;
	}
	public static void main(String[] args) {
		Quiz q1 = new Quiz(100);
		System.out.println(q1.getScore());
		
		/*
		int num=5;
		System.out.println(times2(num));
		double[] money = new double[10];
		for(int i=0;i<10;i++){
			money[i]=i+5.37;
		}
		*/
		//System.out.println(money[0]); // accesses first value in the array
		//System.out.println(money[9]); // accesses last value in the array
		//System.out.println(money[10]); // error
	}
}
