public class Person {
		private String name;
		private int age;
		private String status = "";
		int danger = 11;
		Person(String n, int a) {
			name=n;
			age=a;
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