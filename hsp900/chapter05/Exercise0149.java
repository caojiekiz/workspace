package chapter05;
//import java.util.Scanner;
public class Exercise0149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner myScanner = new Scanner(System.in);
		//System.out.println("请输入一个3位数的正整数：");
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 5 != 0) {
				count++;
				System.out.print(i + "\t");
			}
			if(count % 5 == 0) {
				 System.out.println();
			}
			
		}
	}

}
