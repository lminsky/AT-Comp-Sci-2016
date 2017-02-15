package atcw_20170213;

public class SubClass extends SuperClass {
	String school;
	int grade;
	
	SubClass(String _name, int _age, String _school, int _grade) {
		super(_name, _age);
		school = _school;
		grade = _grade;
	}

}
