package chapter06;

public class ArrayExercise0162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,-1,9,10,23,65};
		int max = arr[0];
		int maxIndex = 0;
		for(int i = 1; i < arr.length; i++) {//从下标1开始遍历arr
			if(max < arr[i]) {//如果max 小于当前元素
				max = arr[i];//
				maxIndex = i;				
			}
		}
		System.out.println("max= " + max + " maxIndex= " + maxIndex);
	}

}
