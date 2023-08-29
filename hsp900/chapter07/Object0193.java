package chapter07;

public class Object0193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat();
		cat1.name = "huahua";
		cat1.age = 2;
		cat1.color = "white";
		Cat cat2 = new Cat();
		cat2.name = "lvlv";
		cat2.age = 3;
		cat2.color = "black";
		System.out.println("第一只猫的信息：" + cat1.name + ' ' + cat1.age + ' ' + cat1.color);
		System.out.println("第二只猫的信息：" + cat2.name + ' ' + cat2.age + ' ' + cat2.color);
		
		
	}

}
class Cat {
	String name;
	int age;
	String color;
	
	
}