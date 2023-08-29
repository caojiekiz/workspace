package chapter06;
import java.util.Scanner;
public class Homework0186 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,12,45,90};
		System.out.println("初始数组元素为：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入要插入的整数：");
		int insertNum = myScanner.nextInt();
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(insertNum <= arr[i]) {
				index = i;
				break;
			}
		}
		//判断index的值
		if(index == -1) {
			index = arr.length;
		}
		//扩容
		int arrNew[]  = new int[arr.length + 1];
		for(int i = 0, j = 0; i < arrNew.length; i++) {
			if(i != index) {
				arrNew[i] = arr[j];
				j++;
			} else {
				arrNew[i] = insertNum; 
			}
		}
		arr = arrNew;
		//遍历插入后的新数组元素
		for(int i = 0; i < arrNew.length; i++) {
			System.out.print(arrNew[i] + "\t");
		}
	}

}
