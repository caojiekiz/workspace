package chapter06;

public class ArrayReverse0166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,22,33,44,55,66,77};
		int temp = 0;
		int len = arr.length;
		for(int i = 0; i < len / 2; i++) {
			temp = arr[len - 1 - i];
			arr[len - 1 - i] = arr[i];//首尾交换
			arr[i] = temp;
		}
		System.out.println("====");
		for(int i = 0; i < len; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("====");
		int[] arr2 = new int[len];
		for(int i = 0; i < len; i++) {
			arr2[i] = arr[len- 1 - i];
			
		}
		arr = arr2;//新建的arr2指向arr
		for(int i = 0; i < len; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
