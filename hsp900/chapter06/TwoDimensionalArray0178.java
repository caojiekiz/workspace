package chapter06;

public class TwoDimensionalArray0178 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{4,6},{1,4,5,7},{-2}};
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = new int[i + 1];//需要给每个一维数组开空间new
//			for(int j = 0; j < arr[i].length; j++ ) {//遍历一维数组，并赋值
//				arr[i][j] = i + 1;
//				//System.out.print(arr[i][j] + " ");
//			}
//		}
		int sum = 0;
		for(int i = 0; i < arr.length; i++ ) {//遍历输出
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j]; 
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("sum= " + sum);
	}

}
