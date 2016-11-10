
/* assignment 
 * Create three different person objects.
 * Use 3 different person methods.
 * Change the value of the int danger in one of your objects.  Discuss why this is dangerous.
 * Println one of the objects.  Discuss what you notice about the method toString()
 * Add a variable to the person class
 * Make a new method in the person class. (be creative)
 * Use that method for one of your person objects.
 */

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