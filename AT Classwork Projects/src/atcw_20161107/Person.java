package atcw_20161107;


public class Person {
		private String name;
		private int age;
		private String status = "";
		private int money;
		Person(String n, int a,int c) {
			name=n;
			age=a;
			money=c;
		}	
		void transaction(int amount, Person p){
			money -=amount;
			p.money+=amount;
		}
		
		//void changeBal (int amount){
		//	money+=amount;
		//}
		
		int getMoney(){
			return money;
		}
		
		void updateStatus(String s) {
			status=s;
		}
		String getName() {
			return name;
		}
		int getAge() {
			return age;
		}
		void growUp() {
			age++;
		}
		public String toString(){
			return name;
		}
	}