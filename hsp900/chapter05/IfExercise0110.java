package chapter05;
import java.util.Scanner;
public class IfExercise0110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入信用分：");
		int grade = myScanner.nextInt();
		//1-100
		if(grade >= 1 && grade <= 100) {
			if(grade == 100) {
				System.out.println("信用极好");
			} else if(grade > 80 && grade <= 99) {
				System.out.println("信用优秀");
			} else if(grade >= 60 && grade <= 80) {
				System.out.println("信用一般");
			} else {
				System.out.println("信用不及格");
			}
		} else {
			System.out.println("请输入1-100的信用分：");
		}
			
	}

}
