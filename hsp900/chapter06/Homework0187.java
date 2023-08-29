package chapter06;
public class Homework0187 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println("初始数组元素为：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		System.out.println("逆序数组元素为：");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}
		//求平均值最大值和最大值下标
		double sum = arr[0];
		int max = arr[0];
		int maxIndex = 0;
		for(int i = 1; i < arr.length; i++) {
			sum += arr[i];
			if( max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("\nmax= " + max + " maxIndex= " + maxIndex);
		System.out.println("\n平均值= " + (sum / arr.length));
		//查找是否有数字8
		int findNum = 8;
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(findNum == arr[i]) {
				System.out.println("找到数 " + findNum + "下标是" + i);
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("没有找到数 " + findNum);
		}
	}

}
