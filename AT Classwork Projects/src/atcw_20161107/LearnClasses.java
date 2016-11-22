package atcw_20161107;

//testing comments
public class LearnClasses {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person student = new Person("Rick",34,100);
		Person student2 = new Person("Randle",80,10);
		student.transaction(10, student2);
		System.out.println(student2.getMoney());
		
	}

}
