
public class Person {
		private String name;
		private int age = 10;
		private String status = "";
		int danger = 10;
		Person(String n, int a) {
			name=n;
			age=a;
		}	
		Person(String n) {
			name=n;
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