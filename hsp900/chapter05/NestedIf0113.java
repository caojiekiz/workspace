package chapter05;
import java.util.Scanner;
public class NestedIf0113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = myScanner.nextInt();
		System.out.println("请输入年龄：");
		int age = myScanner.nextInt();
		if(month >= 4 && month <= 10) {
			if(age >= 18 && age <= 60) {
				System.out.println("成人票价60");
			} else if(age < 18) {
				System.out.println("儿童票价30");
			} else {
				System.out.println("老人票价20");
			}
			
		} else {
			if(age >= 18 && age <= 60) {
				System.out.println("成人票价60");
			} else
				System.out.println("其他票价20");
		}
			
	}

}
