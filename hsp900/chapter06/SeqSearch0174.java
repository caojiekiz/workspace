package chapter06;
import java.util.Scanner;

public class SeqSearch0174 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String[] arr = {"xingqiyi","xingqier","xingqisan","xingqisi","xingqiwu","xingqiliu","xingqitian" };
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入你的字符");
		String str = myScanner.next();
		int index = -1;
		for(int i = 0; i < arr.length; i++) {			
			if(str.equals(arr[i])) {
				System.out.println("恭喜你找到" + str);
				System.out.println("下标为= " + i);
				index = i;
				break;
			}
			
		}
		if(index == -1) {
			System.out.println("没有找到" + str);
		}
		
	}

}
