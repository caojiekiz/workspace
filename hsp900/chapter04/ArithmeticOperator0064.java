package chapter04;

public class ArithmeticOperator0064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10 / 4);
		double d = 10 / 4;
		System.out.println(d);
		//% 的本质 看一个公式 a%b = a - a/b*b
		System.out.println(10 % 3);
		System.out.println(-10 % 3);
		System.out.println(10 % -3);
		System.out.println(-10 % -3);
		//
		System.out.println("Exercise01");
		int i = 1;
		i = i++;//1.temp = i; 2.i= i+1;3.i=temp;
		System.out.println(i);
	}

}
