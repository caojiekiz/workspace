package chapter06;
import java.util.Scanner;
public class ArrayReduce0170 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		Scanner myScanner = new Scanner(System.in);
		
		int[] arr = {1,2};
		
		do {
			int[] arrNew = new int[arr.length - 1];
			for(int i = 0; i < arr.length - 1; i++) {
				arrNew[i] = arr[i];
			}
			//System.out.println("请输入你要缩减的元素：");
			//int addNum = myScanner.nextInt();
			//arrNew[arrNew.length - 1] = addNum;
			arr = arrNew;//扩容后的数组地址赋值
			System.out.println("======缩减后元素情况=======");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
			System.out.println();
			if(arr.length < 2) {
				System.out.println("数组只剩最后一个元素，不能再缩减！");
				break;
			} else { 
				System.out.println("是否继续缩减 y/n");
				char key = myScanner.next().charAt(0);
				if( key == 'n') {
					break;
				}
			}
		}while(true);
		System.out.println("你退出了");
		 
				 
	}
}
