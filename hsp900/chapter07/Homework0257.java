package chapter07;

public class Homework0257 {


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Dog dog = new Dog("taidi","brown",3);
	dog.show();
}

}
class Dog {
	String name; 
	String color;
	int age;
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public void show() {
		System.out.println("名字是" + this.name + "颜色是" + this.color + "年龄是" + this.age);
	}
	
}