
public class LearningClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person student = new Person("Rick",34);
		System.out.println(student.getName());
		student.growUp();
		System.out.println(student.getAge());
		System.out.println(student.danger);
		student.danger=12;
		student.age=4;
		System.out.println(student.danger);
	}

}
