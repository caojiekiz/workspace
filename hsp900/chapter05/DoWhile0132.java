package chapter05;
import java.util.Scanner;
public class DoWhile0132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("da yi ci!");
			System.out.println("huan qian me? y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("ta de huida shi " + answer);
		}while(answer != 'y');
		System.out.println("ta huan qian le");
	}

}
