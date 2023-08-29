package chapter06;

public class TwoDimensionalArray0176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[2][3];
		
		arr[1][1] = 8;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
			//System.out.println(arr.length);
			System.out.println(arr[1].length);
		}
	}

}
