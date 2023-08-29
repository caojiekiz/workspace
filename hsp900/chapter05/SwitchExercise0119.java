package chapter05;
import java.util.Scanner;
public class SwitchExercise0119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = myScanner.nextInt();
		if(month >= 1 && month <= 12) {
			switch(month) {
				case 3:
				case 4:
				case 5:
					System.out.println("这是春季！");
					break;
				case 6:
				case 7:
				case 8:
					System.out.println("这是夏季！");
					break;
				case 9:
				case 10:
				case 11:
					System.out.println("这是秋季！");
					break;
				case 12:
				case 1:
				case 2:
					System.out.println("这是冬季！");
					break;
			}
			
		} else {
			System.out.println("请输入正确的月份！");
		}
			
	}

}
