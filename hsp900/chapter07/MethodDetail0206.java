package chapter07;

public class MethodDetail0206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA();
		int[] res = a.getSumAndSub(4, 10);
		System.out.println("heshi " + res[0]);
		System.out.println("chashi " + res[1]);
		//
		byte b1 = 1;
		byte b2 = 2;
		a.getSumAndSub(b1, b2);
		
	}

}
class AA {
	public int[] getSumAndSub(int n1, int n2) {
		int[] resArr = new int[2];
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
	public double f1() {
		double d1 = 1.1 * 3;
		int n = 100;
		return n;
	}
	public void f2() {
		System.out.println("hello");
		return;
	}
}
