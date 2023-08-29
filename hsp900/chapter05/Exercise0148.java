package chapter05;
import java.util.Scanner;
public class Exercise0148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个3位数的正整数：");
		int num = myScanner.nextInt();
		int n1 = num / 100;
		int n2 = num % 100 / 10;
		int n3 = num % 10;
		if(n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == num) {
			System.out.println("是水仙花数");
		} else {
			System.out.println("不是水仙花数");
		}
	}

}
