package chapter07;

public class MethodParameter0211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		int[] arr = {1,2,3};
		b.test100(arr);//调用方法
		System.out.println("main的arr数组"); 
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t"); 
		}
		System.out.println();
		PersonA p = new PersonA();
		p.name = "jack";
		p.age = 20;
		b.test200(p);
		System.out.println("main的p.age = " + p.age);
		 
		PersonA p1 = new PersonA();
		p1.name = "willa";
		p1.age = 33;
		MytoolsA tools = new MytoolsA();
		PersonA p2 = tools.copyPerson(p1);
		System.out.println(p1 == p2);
	}

}
class PersonA {
	String name;
	int age;
}
class MytoolsA {
	//对象克隆方法
	public PersonA copyPerson(PersonA p) {
		PersonA p2 = new PersonA();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}
class B {
	public void test200(PersonA p) {
		p.age = 2000;//修改属性
	}
	public void test100(int[] arr) {
		arr[0] = 200;
		//遍历数组
		System.out.println("test100的arr数组"); 
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t"); 
		}
		System.out.println();
	}
}