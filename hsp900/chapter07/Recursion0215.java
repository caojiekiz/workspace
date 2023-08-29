package chapter07;

public class Recursion0215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T t1 = new T();
		t1.test(4);
		int n1 = t1.factorial(5);
		System.out.println("n1=" + n1);
	}

}

class T {
	//阶乘
	public int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}
	public void test(int n) {
		if(n > 2) {
			test(n - 1);
		}
		System.out.println("n=" + n);
	}
}