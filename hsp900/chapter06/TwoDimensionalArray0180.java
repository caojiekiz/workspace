package chapter06;

public class TwoDimensionalArray0180 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[6][];//创建二维数组，但是每个一维数组没有开空间 
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];//需要给每个一维数组开空间new
			for(int j = 0; j < arr[i].length; j++ ) {//遍历一维数组，并赋值
				arr[i][j] = i + 1;
				//System.out.print(arr[i][j] + " ");
			}
		}
		for(int i = 0; i < arr.length; i++ ) {//遍历输出
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
