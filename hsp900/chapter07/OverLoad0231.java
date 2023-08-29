package chapter07;

public class OverLoad0231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyCalculator mc = new MyCalculator();
//		System.out.println(mc.calculator(1, 2));
//		System.out.println(mc.calculator(1.1, 2));
//		System.out.println(mc.calculator(1, 1.2));
//		System.out.println(mc.calculator(1, 2, 3));
		Methods method = new Methods();
		method.m(5);
		method.m(5,7);
		method .m("today");
		System.out.println(method.max(10, 20));
		System.out.println(method.max(10.0, 20.0));
		System.out.println(method.max(10.0, 20.0, 20));
	}

}
class Methods {
	public void m(int n) {
		System.out.println("平方=" + n * n );
	}
	public void m(int n1, int n2) {
		System.out.println("相乘=" + n1 * n2);
	}
	public void m(String str) {
		System.out.println("传入的str是" + str);
	}
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2, double n3) {
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}
}