package chapter07;

public class Homework0259 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
class Employee {
	String name;
	char gender;
	int age;
	String job;
	double sal;
	public Employee(String job, double sal) {
		this.job = job;
		this.sal = sal;
	}
	public Employee(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Employee(String job, double sal,String name, char gender, int age) {
		this(name, gender, age);//this调用要写在构造器第一句
		this.job = job;
		this.sal = sal;
	}
}