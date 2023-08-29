package chapter05;
import java.util.Scanner;
public class MulForExercise0134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;
		int passNum = 0;
		int classNum = 3;
		int stuNum = 5;
		for(int i = 1; i<= classNum; i++) {
			double sum = 0;
			for(int j = 1; j <= stuNum; j++) {
				System.out.println("请输入第" + i + "个班的第" + j + "个学生的成绩");
				double score = myScanner.nextDouble();
				if(score >= 60) {
					passNum++;
				}
				System.out.println("成绩为" + score);
				sum += score;
			}
			System.out.println("sum = " + sum + " 平均分= " + (sum / 5));
			totalScore += sum;
		}
		System.out.println("三个班总分 = " + totalScore + " 总平均分= " + totalScore/ (classNum * stuNum));
		System.out.println("及格人数 = " + passNum);
	}

}
