package chapter07;

public class Method0201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.speak();
		p.cal01();
		p.cal02(100);
		p.cal02(10);
		//
		int returnRes = p.getSum(10, 20);
		System.out.println("getSum计算结果= " + returnRes);
	}

}
class Person {
	String name;
	int age;
	public void speak() {
		System.out.println("我是一个社会人！");
	}
	public void cal01() {
		int res = 0;
		for(int i = 0; i <= 1000; i++) {
			res += i;
		}
		System.out.println("cal01计算结果= " + res);
	}
	public void cal02(int n) {
		int res = 0;
		for(int i = 0; i <= n; i++) {
			res += i;
		}
		System.out.println("cal02计算结果= " + res);
	}
	//计算两个数的和
	public int getSum(int num1, int num2) {
		int res = num1 +num2;
		return res;
	}
}